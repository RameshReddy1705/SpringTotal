import { useState } from "react"

const List=()=>{
    let[abc,setAbc]=useState(["Hiii","Hello","Bye"])
    console.log(abc)
    let btm=()=>{
        setAbc("Bye")
    }
    return (
        <div>
            {/* <h1>{abc[2]}</h1> */}
            {abc.map((x)=>{
                return(
                    <h1>{x}</h1>
                )
                
            })}
            
        </div>
    )
}
export default List