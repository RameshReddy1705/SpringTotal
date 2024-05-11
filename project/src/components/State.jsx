import { useState } from "react"

const State =()=>{
    let[abc,setAbc]=useState("Ramesh Reddy")
    let dce=()=>{
        setAbc("RRR")
    }

    let fgh=()=>{
        setAbc("Siva")
    }
    

    return(
        <div>
             {abc}
             <button onMouseMove={dce}>Ramesh</button>
             <button onMouseLeave={fgh}>Reverse</button>
        </div>
       
    )
}

export default State