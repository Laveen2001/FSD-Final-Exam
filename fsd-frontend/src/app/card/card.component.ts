import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-card',
  standalone: true,
  imports: [],
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})
export class CardComponent {


  @Input() name="";
  @Input() city="";
  @Input() rating="";
  @Input() roomPrice=""; 

  @Input() wifi=false;
  @Input() gym=false;
  @Input() pool=false;
  

  @Input() imageUrl="";
  

}
