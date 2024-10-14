import { Component } from '@angular/core';
import { CardComponent } from "../card/card.component";
import { BackendApiService } from '../service/backend-api.service';
import { Form, FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CardComponent, ReactiveFormsModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {  

  items = [1, 2, 3];
  hotels: any = [];


  constructor(private service: BackendApiService) {

  }

  ngOnInit() {
    this.service.getAllHotels().subscribe((response: any) => {
      this.hotels = response;
    })
    console.log('Hotels', this.hotels);
  }
  
  rating = new FormControl('',[Validators.min(0),Validators.max(5)]);
  city = new FormControl('');


  filterFormGroup = new FormGroup({
    rating:this.rating,
    city:this.city
  })
  

  filter(){
    var filHotel: any[] = [];
    if(this.rating!==null){

      this.hotels.filter((element:any)=>{
          // element?.rating==this.rating.value;
          if(element?.rating==this.rating.value){
            filHotel.push(element);
          }
      })
    }

    if(this.city!==null){
      this.hotels.filter((element:any)=>{
          // element?.city==this.city.value;
          if(element?.city==this.city.value){
            filHotel.push(element);
          }
      })
    }

    console.log('Filtered',filHotel);
    this.hotels=filHotel;


  }

}
