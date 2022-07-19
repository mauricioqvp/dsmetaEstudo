import React from 'react';
import logo from '../../img/logo.svg';
import './styles.css';

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="Logomarca" />
                    <h1>DSMeta</h1>
                    <p>Desenvolvido por
                        <a href="https://www.instagram.com/devsuperior.ig">@mauricioqvp.ig</a>
                    </p>
            </div>
        </header>
    );
}

export default Header;