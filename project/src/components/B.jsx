import { useState } from "react"

const B=()=>{
    let [count,setCount]=useState(0)
    let incre =()=>{
        setCount(count+1)
    }
    return(
        <div>
            {count}
            <button onMouseOver={incre} onMouseLeave={incre}>Increment2</button>

        </div>
    )
}
export default B