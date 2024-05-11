import { useState } from "react";

const Hoc=(WrappedComp)=>{
    function Hoc1(){
        let [count,setCount]=useState(0)
    
        let Incre=()=>{
            setCount(count+1)
        }
        return(
            <div>
                <WrappedComp data={count} Func={Incre}/>
            </div>
        )
    }
    return Hoc1
}
export default Hoc