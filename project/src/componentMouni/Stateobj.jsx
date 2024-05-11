import { useState } from "react"
const Stateobj=()=>{
    let[obj,setObj]=useState({name:"Mounika",id:420})
    return(
        <div>
            <h1>{obj.name}</h1>
            <h1>{obj.id}</h1>
           

        </div>
    )
}
export default Stateobj