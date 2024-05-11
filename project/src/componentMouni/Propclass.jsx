import { Component } from "react";
class Propclass extends Component{
    render(){
        console.log(this.Props)
        return(
            <div>
                Hii{this.props.data}
            </div>
        )
    }
}
export default Propclass