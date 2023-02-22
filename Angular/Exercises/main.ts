import { Post } from "./Post";

let post1: Post = new Post(
    "first post about the sun",
    10,
    10,
    false,
    false
);

post1.ClickUpVotePost();
console.log(" post content: " + post1.GetPostContent() );
console.log(" number of upvotes is: " + post1.upVotes );
console.log(" number of downVotes is: " + post1.downVotes);
console.log("state of the buttons is:");
console.log("           up vote button is: " + post1.upvoteButtonOn);
console.log("           down vote button is: " + post1.downvoteButtonOn);

post1.ClickUpVotePost();
console.log(" post content: " + post1.GetPostContent() );
console.log(" number of upvotes is: " + post1.upVotes );
console.log(" number of downVotes is: " + post1.downVotes);
console.log("state of the buttons is:");
console.log("           up vote button is: " + post1.upvoteButtonOn);
console.log("           down vote button is: " + post1.downvoteButtonOn);
