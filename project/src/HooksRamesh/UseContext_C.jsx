import { useContext } from "react"
import useData from "./UseContex_A"
const UseContext_C=()=>{
    let user=useContext(useData)
    return(
        <div>
            {user}Reddy
        </div>
    )
}
export default UseContext_C