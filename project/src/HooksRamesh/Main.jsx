import { useState } from "react"
import Buttons from "./Buttons"
import Count from "./Count"
import Name from "./Name"
import { useCallback } from "react"

const Main=()=>{
    let [age, setAge]=useState(23)
    let [salary, SetSalary]=useState(15000)

    let ageIncre=useCallback(()=>{
        setAge(age+1)
    },[age])

    let salIncre=useCallback(()=>{
        SetSalary(salary+5000)
    },[salary])
    return(
        <div>
            <Name name={"Ramesh"}>Name</Name>
            <Count data={age}>Age</Count>
            <Buttons fun={ageIncre}>Age Increment</Buttons>
            <Count data={salary}>Salary</Count>
            <Buttons fun={salIncre}>Sal Increment</Buttons>
        </div>
    )
}
export default Main