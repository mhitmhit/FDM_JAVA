import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-basic-bindings',
  templateUrl: './basic-bindings.component.html',
  styleUrls: ['./basic-bindings.component.css']
})
export class BasicBindingsComponent implements OnInit {


  title = 'my first demo project';
  name = "y.e";
  imgSrc: string = "image.url";

  constructor(){}

  ngOnInit(): void {
   // runs on compoenent load by defeault
   this.setImgSrc();
  }

  setImgSrc(){
    // generates random img src strings
    this.imgSrc = "image.url";
  }

  toggleImg() {
    // runs when the toggle image is clicked
  }



}
