import{ useState }from "react"

const States=()=>{
    let[abc,setAbc]=useState("Humgry")
    let raj=()=>{
       setAbc("............")
    }
    let btm1=()=>{
        setAbc("N.T.R")
    }
    return(
        <div>
            {abc}
            <button onClick={raj}>food</button>
            <button onClick={btm1}>RRR</button>

        </div>
    )
}
export default States