import B from "./B";
const A=(abc)=>{
    console.log(abc);
    return(
        <div>
            <B data1={abc.data}></B>
        </div>
    )
}
export default A