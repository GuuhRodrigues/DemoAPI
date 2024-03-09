document.addEventListener("DOMContentLoaded", function() {
    const url = 'https://parallelum.com.br/fipe/api/v1/carros/marcas';

    fetch(url)
        .then(response => response.json())
        .then(data => {
            const tableBody = document.querySelector("#dados-table tbody");

            data.forEach(item => {
                const row = "
                    <tr>
                        <td>${item.codigo}</td>
                        <td>${item.nome}</td>
                    </tr>
                "";
                tableBody.innerHTML += row;
            });
        })
        .catch(error => console.error('Erro ao buscar dados:', error));
});
