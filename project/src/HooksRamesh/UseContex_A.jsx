import { createContext } from "react"
import UseContext_B from "./UseContext_B"

export let useData=createContext()
const UseContext_A=()=>{
    return(
        <div>
            <useData.Provider value="Ramesh">
                <UseContext_B></UseContext_B>
            </useData.Provider>
            
        </div>
    )
}
export default UseContext_A