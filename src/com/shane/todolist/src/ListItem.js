import React , {Component} from 'react';
import './ListItem.css';
class ListItem extends Component{
    constructor(props){
        super(props);
        this.state = {
            color:'black'
        }

    }


onAddBtnClick = () =>{
       
    //   //  this.state.style.color= 'gray';
    //   var fontColor = document.getElementsByClassName("item");
    //   fontColor.color = 'gray';
     this.setState({
         color:'gray'
    })
      
   }
  
// const ListItem = (props) =>{ 
    render(){
     if(this.props.item.done){
         return  <p className="done-item">{this.props.item.content}</p>
       //  style={{color:this.state.style.color}}  
               
     }else{
         return <div><p className="item" style ={{color:this.state.color}}>{this.props.item.content}</p>
         <button onClick = {this.onAddBtnClick}>finish</button>
         
         </div>
    }

    }

 
        
 }




export default ListItem;