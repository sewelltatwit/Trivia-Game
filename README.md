# Trivia-Game

## Trivia Tastic 

**What?**
>an efficient program that is simple to manage and quick to play that allows
>a more flexible experience. A minimalistic game such as a trivia could help stimulate a player
>and make their enjoyment feel more rewarding.

**Why?**
1. Mobile trivia multiplayer games are either outdated or uninteresting. 
2. Trivia is something that many see as a productive form of entertainment.
3. Also, many of these games are either only for entertainment or restricted 
to being a ‘study tool’ allowing it to be customizable makes it so the
player can do both. 

**How**
We will have an always on server that will feed information to clients which will 
send keyword input back to the server.

**Deliverable**
By the end of the semester we expect to have a fully functioning game that
will allow users to connect between themselves and the server. There will be questions received
by a user who will submit an answer, which will then be interpreted by the server. Once the test
is complete a score will be returned, and perhaps the questions that were incorrect with the
expected answers.
Eventually, connecting at least 2 players and allowing us to see who gets the higher score will be
the final objective.
Stress Goal: We will try to create a GUI if time permits.


**Plan**
- 11/10/18 - A working connection will be established between two (possibly more) end users that
can transmit messages.
- 11/20/18 - A game that works in a controlled setting (no connection)
- 11/25/18 - We hope to have a finished “trivia server” that will handle messages sent to and from
end users and record them.
- 12/1/19 - A reliable connection between 2 players and displaying winner.

**Demo Flow**
Server developed by Sean will send question  - to - Client developed by Tyla - displayed on - A GUI made by Nick

**Getting Started**
- Install
- Run

**Features**
- Server to send the questions to the player and a score based on each answer the player picks
- GUI on the player end that displays the question, answer choices, score, and a button for each choice

**Conclusion**
We learned how to read and write using a buffer, and how to use the buffer to send messages between a server and a client. We reinforced our understanding of socket programming and how to debug. The buffered reader wasn't always predictable, but by debugging and going step by step we were able to get it to work in the end.

**Team members**

Nick Moyer
Sean Cox
Tyla Sewell

# Comments
1. Give more details on the deliverables. Think about what you are going to demo in the final presentation and compile a list of features that will be delivered. What does it mean by a fully functioning trivia game? 
2. For the plan, remove [], add the concrete date ranges. Don't use "we hope"
