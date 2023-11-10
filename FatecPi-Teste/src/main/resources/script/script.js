function checkCNPJ(cnpj) {
    $.ajax({
        'url': `https://receitaws.com.br/v1/cnpj/` + cnpj.replace(/[^0-9]/g, ''),
        'type': "GET",
        'dataType': "jsonp",
        'success': function (data) {
            if (data.nome === undefined) {
                alert(data.status + ' ' + data.message);

                document.getElementById('logradourojs').value = '';
                document.getElementById('numero').value = '';
                document.getElementById('emailjs').value = '';
            } else {
                document.getElementById('logradourojs').value = data.logradouro;
                document.getElementById('numerojs').value = data.numero;
                document.getElementById('emailjs').value = data.email;
            }
            console.log(data);
        }
    });
}

$(document).ready(function () {
    $("#cadastroForm").submit(function (event) {
        event.preventDefault(); // Impede o envio do formulário padrão

        var formData = $(this).serialize(); // Obtém os dados do formulário

        $.ajax({
            type: "POST",
            url: "/save",
            data: formData,
            success: function () {
                // Operação bem-sucedida: mostrar um pop-up de sucesso
                alert("Cadastro válido");
            },
            error: function () {
                // Falha na operação: mostrar um pop-up de erro
                alert("Falha no cadastro");
            }
        });
    });
});


$(document).ready(function () {
    $("#cadastroPontoForm").submit(function (event) {
        event.preventDefault(); // Impede o envio do formulário padrão

        var formData = $(this).serialize(); // Obtém os dados do formulário

        $.ajax({
            type: "POST",
            url: "/savePonto",
            data: formData,
            success: function () {
                // Operação bem-sucedida: mostrar um pop-up de sucesso
                alert("Cadastro válido");
            },
            error: function () {
                // Falha na operação: mostrar um pop-up de erro
                alert("Falha no cadastro");
            }
        });
    });
});
