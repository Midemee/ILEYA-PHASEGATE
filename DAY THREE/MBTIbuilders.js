const prompt = require("prompt-sync")();

function calculateMBTI(answers) {
    let extrovert = 0;
    let introvert = 0;
    let sensing = 0;
    let intuition = 0;
    let thinking = 0;
    let feeling = 0;
    let judging = 0;
    let perceiving = 0;

    for (let index = 0; index < answers.length; index++) {
        if (index % 4 === 0) {
            if (answers[index] === "A") extrovert++; else introvert++;
        } else if (index % 4 === 1) {
            if (answers[index] === "A") sensing++; else intuition++;
        } else if (index % 4 === 2) {
            if (answers[index] === "A") thinking++; else feeling++;
        } else if (index % 4 === 3) {
            if (answers[index] === "A") judging++; else perceiving++;
        }
    }

    let result = "";
    result += (extrovert  > introvert)  ? "E" : "I";
    result += (sensing    > intuition)  ? "S" : "N";
    result += (thinking   > feeling)    ? "T" : "F";
    result += (judging    > perceiving) ? "J" : "P";

    return result;
}

function printPersonalityDescription(result) {
    if (result === "INTJ") {
        console.log(`The Architect (16Personalities)
INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits.
These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to
everything they do. Their inner world is often a private, complex one.
People with the INTJ personality type are intellectually curious individuals with a deep-seated thirst
for knowledge. INTJs tend to value creative ingenuity, straightforward rationality, and self-improvement.
They consistently work toward enhancing intellectual abilities and are often driven by an intense desire
to master any and every topic that piques their interest.
INTJs question most things, basing their beliefs on solid evidence, reasoning, and rationality. Ever-skeptical
INTJ personalities prefer to make their own discoveries. In their quest to find better ways of doing things,
they aren't afraid to break the rules or risk disapproval – in fact, they often rather enjoy it.`);

    } else if (result === "INTP") {
        console.log(`The Logician (16Personalities)
INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits.
These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek
out unlikely paths, mixing willingness to experiment with personal creativity.
People with the INTP personality type pride themselves on their unique perspective and vigorous intellect.
They can't help but puzzle over the mysteries of the universe – which may explain why some of the most
influential philosophers and scientists of all time have been INTPs.
From the outside, INTPs may seem to live in a never-ending daydream. They have a reputation for being
pensive, detached, and a bit reserved – until they actively direct all of their mental energy on the
moment or person at hand.`);

    } else if (result === "ENTJ") {
        console.log(`The Commander (16Personalities)
ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits.
They are decisive people who love momentum and accomplishment. They gather information to construct
their creative visions but rarely hesitate for long before acting on them.
People with the ENTJ personality type are natural-born leaders. Embodying the gifts of charisma and
confidence, ENTJs project authority in a way that draws crowds together behind a common goal.
If there's anything ENTJs love, it's a good challenge. They firmly believe that, given enough time and
resources, they can achieve any goal – making them brilliant entrepreneurs and powerful business leaders.`);

    } else if (result === "ENTP") {
        console.log(`The Debater (16Personalities)
ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits.
They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility.
Quick-witted and audacious, people with the ENTP personality type aren't afraid to disagree with the
status quo. Few things light them up more than a bit of verbal sparring – and if the conversation
veers into controversial terrain, so much the better.
ENTPs are known for their rebellious streak. No belief is too sacred to be questioned, no idea too
fundamental to be scrutinized, and no rule too important to be broken or at least thoroughly tested.`);

    } else if (result === "INFJ") {
        console.log(`The Advocate (16Personalities)
INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits.
They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal
values, and a quiet, principled version of humanism guide them in all things.
Idealistic and principled, people with the INFJ personality type aren't content to coast through
life – they want to stand up and make a difference. Success for them comes from seeking fulfillment,
helping others, and being a force for good in the world.
INFJs care deeply about integrity, and they're rarely satisfied until they've done what they know
to be right. They move through life with a clear sense of their values, guided by their own wisdom.`);

    } else if (result === "INFP") {
        console.log(`The Mediator (16Personalities)
INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits.
These rare personality types tend to be quiet, open-minded, and imaginative, applying a caring and
creative approach to everything they do.
Although they may seem quiet or unassuming, INFPs have vibrant, passionate inner lives. They are
known for their sensitivity – these personalities can have profound emotional responses to music,
art, nature, and the people around them.
Idealistic and empathetic, INFPs long for deep, soulful relationships and feel called to help others.
Their rich sensitivity and profound creativity give them unique potential to connect deeply and
initiate positive change.`);

    } else if (result === "ENFJ") {
        console.log(`The Protagonist (16Personalities)
ENFJ (Protagonist) is a personality type with the Extraverted, Intuitive, Feeling, and Judging traits.
These warm, forthright types love helping others, and they tend to have strong ideas and values.
ENFJs are born leaders, found among many notable politicians, coaches, and teachers. Their passion
and charisma allow them to inspire others not just in their careers but in every arena of their lives.
Few things bring ENFJs deeper joy than guiding friends and loved ones to grow into their best selves.
They tend to be vocal about their values and speak in ways that resonate with others.`);

    } else if (result === "ENFP") {
        console.log(`The Campaigner (16Personalities)
ENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and Prospecting traits.
These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill.
People with the ENFP personality type are true free spirits – outgoing, openhearted, and open-minded.
Though they can be the life of the party, they don't just care about having a good time. They have
profound depths fueled by their intense desire for meaningful, emotional connections with others.
ENFPs carry an interesting blend of carefree sociability, sparkling imagination, and deep introspection,
using their curiosity and creativity to better understand themselves and human relationships.`);

    } else if (result === "ISTJ") {
        console.log(`The Logistician (16Personalities)
ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits.
These people tend to be reserved yet willful, with a rational outlook on life. They compose their
actions carefully and carry them out with methodical purpose.
People with the ISTJ personality type mean what they say and say what they mean. With their responsible
and dependable nature, they also tend to have a deep respect for structure and tradition.
ISTJs do more than their share to keep society on a sturdy, stable foundation. In their families and
communities, they earn respect for their reliability, practicality, and ability to stay grounded.`);

    } else if (result === "ISFJ") {
        console.log(`The Defender (16Personalities)
ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits.
These people tend to be warm and unassuming in their own steady way. They're efficient and responsible,
giving careful attention to practical details in their daily lives.
People with the ISFJ personality type help make the world go round. Hardworking and devoted, they feel
a deep sense of responsibility to those around them and can be counted on to meet deadlines, remember
birthdays, uphold traditions, and shower loved ones with gestures of care and support.
ISFJs are truly more than the sum of their parts. Though sensitive and caring, they also have excellent
analytical abilities and an eye for detail.`);

    } else if (result === "ESTJ") {
        console.log(`The Executive (16Personalities)
ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits.
They possess great fortitude, emphatically following their own sensible judgment. They often serve
as a stabilizing force among others, able to offer solid direction amid adversity.
People with the ESTJ personality type are representatives of tradition and order. Embracing the values
of honesty and dedication, they are valued for their mentorship mindset and ability to create and
follow through on plans in a diligent and efficient manner.
ESTJs are aware of their surroundings and live in a world of clear, verifiable facts. They stick to
their principles and push an unclouded vision of what is and is not acceptable.`);

    } else if (result === "ESFJ") {
        console.log(`The Consul (16Personalities)
ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits.
They are attentive and people-focused, enjoying taking part in their social community. Their
achievements are guided by decisive values, and they willingly offer guidance to others.
For people with the ESFJ personality type, life is sweetest when it's shared with others. These
social individuals form the bedrock of many communities, opening their homes and their hearts to
friends, loved ones, and neighbors.
Generous and reliable, ESFJs often take it upon themselves to hold their families and communities
together, strongly believing in the power of hospitality and good manners.`);

    } else if (result === "ISTP") {
        console.log(`The Virtuoso (16Personalities)
ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits.
They tend to have an individualistic mindset, pursuing goals without needing much external connection.
People with the ISTP personality type love to explore with their hands and their eyes, touching and
examining the world around them with impressive diligence, casual curiosity, and healthy skepticism.
They are natural makers, moving from project to project and learning from their environment as they go.
ISTPs prefer to approach problems directly, relying on firsthand experience and trial and error. They
usually prefer to work at their own pace, on their own terms, and without unnecessary interruptions.`);

    } else if (result === "ISFP") {
        console.log(`The Adventurer (16Personalities)
ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits.
They tend to have open minds, approaching life, new experiences, and people with grounded warmth.
People with the ISFP personality type are true artists – though not necessarily in the conventional sense.
For these types, life itself is a canvas for self-expression. With their exploratory spirit and ability
to find joy in everyday life, ISFPs can be among the most interesting people you'll ever meet.
Driven by fairness and open-mindedness, ISFPs move through life with an infectiously encouraging attitude,
loving to motivate those close to them to follow their passions.`);

    } else if (result === "ESTP") {
        console.log(`The Entrepreneur (16Personalities)
ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits.
They tend to be energetic and action-oriented, deftly navigating whatever is in front of them.
People with the ESTP personality type are vibrant individuals brimming with enthusiastic and spontaneous
energy. They tend to be competitive, rarely wasting time thinking about the past. They excel at keeping
their attention rooted in the present.
ESTPs keep their conversations energetic and intelligent, but they like to talk about what is – or better
yet, to just go out and do it. They often leap before they look, fixing mistakes as they go.`);

    } else if (result === "ESFP") {
        console.log(`The Entertainer (16Personalities)
ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits.
These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown.
ESFP personalities are inclined toward putting on a show for others and generally appear comfortable in the
spotlight. It is not their love for attention that drives this confidence, but their knack for sensing
what's appropriate in certain situations.
ESFPs truly enjoy the simplest things, and there's no greater joy for them than having fun with a good
group of friends. With their unique wit, they love soaking up attention and making every gathering feel
like a party.`);

    } else {
        console.log("Personality type not found.");
    }
}

const questions = [
    "1. A. Expend energy, enjoy groups          B. Conserve energy, enjoy one-on-one",
    "2. A. Interpret literally                  B. Look for meaning and possibilties",
    "3. A. Logical, thinking, questioning       B. Empathetic, feeling, accommodating",
    "4. A. Organized, orderly                   B. Flexible, adaptable",
    "5. A. More outgoing, think out loud        B. More reserved, think to yourself",
    "6. A. Practical, realistic experiential    B. Imaginative, innovative, theoretical",
    "7. A. Candid, straight forward, frank      B. Tactful, kind, encouraging",
    "8. A. Plan, schedule                       B. Unplanned, spontaneous spontaneity",
    "9. A. Seek many tasks, public activities   B. Seek private, solitary activities with quiet to concentrate",
    "10. A. Standard, usual, conventional       B. Different, novel, unique",
    "11. A. Firm, criticize, hold the line      B. Gentle, tend to appreciate, conciliate",
    "12. A. Regulated, structured               B. Easy-going, live and let live",
    "13. A. External, communicative,expressive  B. Internal, reticent, keep to yourself",
    "14. A. Focus on here-and-now               B. Look to the future, global perspective, big picture",
    "15. A. Tough-minded, just                  B. Tender-hearted, merciful",
    "16. A. Preparation, plan ahead             B. Go with the flow, adapt as you go",
    "17. A. Active, initiate                    B. Reflective, deliberate",
    "18. A. Facts, things, what is              B. Ideas, dreams, what could be, philosophical",
    "19. A. Matter of fact, issue-oriented      B. Sensitive, people-oriented, compassionate",
    "20. A. Control, govern                     B. Latitude, freedom"
];

const answers = new Array(20);

console.log("TAKE MBTI PERSONALITY TEST");

for (let index = 0; index < questions.length; index++) {
    let testRunning = true;
    while (testRunning) {
        console.log(questions[index]);
        const userChoice = prompt("Select A or B: ").toUpperCase();
        console.log();

        if (userChoice === "A" || userChoice === "B") {
            answers[index] = userChoice;
            testRunning = false;
        } else {
            console.log("Invalid input! Please Try again");
        }
    }
}

const result = calculateMBTI(answers);
console.log(`\nPERSONALITY RESULT\nMBTI Type is: ${result}`);
printPersonalityDescription(result);
