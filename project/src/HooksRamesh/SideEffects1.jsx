import { useEffect, useState } from "react"

const SideEffects1=()=>{
    let [count, setcount]=useState(0)
    let incre=()=>{
        setcount(count+1)
    }
    let dec=()=>{
        setcount(count-1)
    }
    useEffect(()=>{
        console.log("Ramesh");
    },[])
    return(
        <div>
            <h1>{count}</h1>
            <button onClick={incre}>Increment</button>
            <button onClick={dec}>Decrement</button>
        </div>
    )
}
export default SideEffects1