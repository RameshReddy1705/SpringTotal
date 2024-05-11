import { useState } from "react"

const TaskCal=()=>{
    let [count,setcount]=useState(0)
    let In=()=>{
        setcount(count+1)
    }
    let De=()=>{
        setcount(count-1)
    }
    let Re=()=>{
        setcount(0)
    }
    return(
        <div>
            <h1>{count}</h1>
            <button onClick={In}>Increment</button>
            <button onClick={De}>Decrement</button>
            <button onClick={Re}>Reset</button>
            

        </div>
    )
}
export default TaskCal