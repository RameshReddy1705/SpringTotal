import Grandchild from "./Grandchild";
const Child=(x)=>{
    console.log(x);
    return(
        <div>
            <Grandchild data1={x.data}/>
        </div>
    )
}
export default Child
