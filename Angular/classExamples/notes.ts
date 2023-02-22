// parameter type setup

function printMessage(message: string){
    console.log(message);
}

printMessage('Hello everyone!');



// function return type setup
function greet(): string{
    return 'Hello word greeting';
}

console.log(greet());




// functin param and return type settings
function add(num1: number, num2: number): number {
    return num1 + num2;
}





// to point class
class Point {
    x:number;
    y:number;

    constructor(x:number, y:number){
        this.x=x;
        this.y=y;
    }
    
    getArea(): number {
        return this.x * this.y;
    }
}

// to create obj of a class
const pt = new Point(1, 5);
pt.x=0;
pt.y=1;






// 

