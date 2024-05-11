import { useState } from "react"

const Assi=()=>{
    let [count,setCount]=useState(0)

    let incre=()=>{
        setCount(count+1)
    }

    let decre=()=>{
        setCount(count-1)
    }

    let reset=()=>{
        setCount(count=0)
    }
    return(
        <div>
            {count}
            <button onClick={incre}>increment</button>
            <button onClick={decre}>decrement</button>
            <button onClick={reset}>reset</button>

        </div>
    )
}

export default Assi