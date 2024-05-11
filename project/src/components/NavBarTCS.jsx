import image from "./tcsLogo.png"
import css from "./navbarTCS.module.css"
import tata from "./tata.png"
import ser from "./tcssearch.png"
const NavBarTCS=()=>{
    return(
        <section id={css.nav}>
            <article>
                <div className={css.logo}>
                    <a href="https://www.tcs.com/"><img src={image} alt="" height="58" width="165"/></a>
                </div>
                <article className={css.menu}>
                    <div className={css.list}>
                         <ol>
                            <li><a href="https://www.tcs.com/what-we-do">What we do</a></li>
                            <li><a href="https://www.tcs.com/who-we-are">Who we are</a></li>
                            <li><a href="https://www.tcs.com/insights">Insights</a></li>
                            <li><a href="https://www.tcs.com/careers">Careers</a></li>
                            <li><a href="https://www.tcs.com/investor-relations">Investors</a></li>
                        </ol>
                    </div>
                    <div className={css.empty}>

                    </div>
                    <div className={css.sup}>
                        <ol>
                            <li><a href="https://www.tcs.com/contact-us/whats-on-your-mind">CONTACT US</a></li>
                            <li><a href="https://www.tcs.com/who-we-are/worldwide">TCS WORLDWIDE</a></li>
                        </ol>
                    </div>
                </article>
                <div class={css.search}><a href="jwfw"><img src={ser} alt="" height="40" /></a></div>
                <div class={css.tata}><a href="https://www.tata.com/"><img src={tata} alt="" height="50" /></a></div>
            </article>
        </section>
    )
}
export default NavBarTCS