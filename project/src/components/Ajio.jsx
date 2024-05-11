import ag from './ajio.module.css'
import React from 'react'

const Ajio = () => {
  return (
    <div>
      <section  id={ag.shop}>
        <article>
            <div className={ag.Logo}><img width="150px" src="https://assets.ajio.com/static/img/Ajio-Logo.svg" alt="" title=""/></div>
            <div className={ag.letter}><ul>
            <li>MEN</li>
            <li>WOMEN</li>
            <li>KIDS</li>
            <li>INDIE</li>
            <li>HOME AND KICHEN</li></ul></div>
            <div className={ag.multi}>
            <div><ul>
            <li>Sing in / Join AJIO</li>
            <li>customer care</li>
            <li id={ag.a}>visit AJIOLUXE</li></ul></div>
            <div><ul>
            <li><input class="form-control me-2" type="search" placeholder="Search AJIO" aria-label="Search"/></li>
            <li><i class="fa-solid fa-heart"></i>
</li>
            <li><i class="fa-solid fa-bag-shopping"></i></li></ul></div></div>
        </article>
      </section>
    </div>
  )
}

export default Ajio
