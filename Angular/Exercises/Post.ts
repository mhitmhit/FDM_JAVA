export class Post {

    upVotes: number;
    downVotes: number;
    upvoteButtonOn: boolean;
    downvoteButtonOn: boolean;
    
    constructor(
        private postContent: string, 
        upVotes: number,
        downVotes: number,
        upvoteButtonOn: boolean,
        downvoteButtonOn: boolean
        ){
            this.upVotes = upVotes;
            this.downVotes = downVotes;
            this.upvoteButtonOn = upvoteButtonOn;
            this.downvoteButtonOn = downvoteButtonOn;
    }

    GetPostContent(){
        return this.postContent;
    }

    ClickUpVotePost(){
        if (this.upvoteButtonOn === false){
                this.upvoteButtonOn = true;
                this.upVotes++;
        }else{
                this.upvoteButtonOn = false;
                this.upVotes--;
        }
    }

    ClickDownVotePost(){
        if (this.downvoteButtonOn === false){
            this.downvoteButtonOn = true;
            this.downVotes++;
    }else{
            this.downvoteButtonOn = false;
            this.downVotes--;
    }
    }
}