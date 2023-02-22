"use strict";
exports.__esModule = true;
exports.Post = void 0;
var Post = /** @class */ (function () {
    function Post(postContent, upVotes, downVotes, upvoteButtonOn, downvoteButtonOn) {
        this.postContent = postContent;
        this.upVotes = upVotes;
        this.downVotes = downVotes;
        this.upvoteButtonOn = upvoteButtonOn;
        this.downvoteButtonOn = downvoteButtonOn;
    }
    Post.prototype.GetPostContent = function () {
        return this.postContent;
    };
    Post.prototype.ClickUpVotePost = function () {
        if (this.upvoteButtonOn === false) {
            this.upvoteButtonOn = true;
            this.upVotes++;
        }
        else {
            this.upvoteButtonOn = false;
            this.upVotes--;
        }
    };
    Post.prototype.ClickDownVotePost = function () {
        this.downvoteButtonOn = false;
        this.downVotes++;
    };
    return Post;
}());
exports.Post = Post;
