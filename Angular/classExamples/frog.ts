export class Frog {
    //private weightInGrams: number;
//    weightInGrams: number;
 //   color: string;
// 
    // constructor(weightInGrams: number, color: string){
    //     this.weightInGrams = weightInGrams;
    //     this.color = color;
    // }

// shorter way to do fields and constructor:
// adding access modifier before param tells TS that
// we want to create a private variable in this objec
// and set its value to passed in value.
constructor(private weightInGrams: number, private color: string){
    // they are also automatically assigned.
}

    jump(){
        console.log('The ' + this.color + 'frog is jumping');
        console.log('The ' + this.color + 'frog weighs: ' + this.weightInGrams);
    }
}