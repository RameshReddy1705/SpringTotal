import { useState } from "react"

const A=()=>{
    let[count, setCount]=useState(0)
    let Incre=()=>{
        setCount(count+1)
    }
    return(
        <div>
            {count}
            <button onClick={Incre}onMouseLeave={Incre}>Increment</button>

        </div>
    )
}
export default A