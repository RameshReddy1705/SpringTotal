import { useState } from "react"

const Perform=()=>{
    let [count1, setCount1]=useState(0)
    let [count2,setCount2]=useState(0)

    let incre=()=>{
        setCount1(count1+1)
    }

    let decre=()=>{
        setCount2(count2-1)
    }

    let Even=(()=>{
        let i=0
        while(i<1000000) i++
        return count1%2==0
    })
    return(
        <div>
            {count1}
            <button onClick={incre}>Increment</button>
            {Even()?:Even:Odd}
            {count2}
            <button onClick={decre}>Decrement</button>
        </div>
    )
}
export default Perform