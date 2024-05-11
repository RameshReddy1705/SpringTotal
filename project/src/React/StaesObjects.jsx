import { useState } from "react"

const StatesObjects=()=>{
    let [Objects]=useState({name:"Ramesh",id:3,number:12345})
    return(
        <div>
            <h1>{Objects.name}</h1>
            <h1>{Objects.id}</h1>
            <h1>{Objects.number}</h1>

        </div>
    )
}
export default StatesObjects