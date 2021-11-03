package br.github.jassonluiz.importbr.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.github.jassonluiz.importbr.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Echo Dot (3ª Geração)");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/41GZCWFJB1L._AC_SX425_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/dp/B07PDHSJ1H/?pf_rd_r=CWWMNJR57HBPCNP2WZPC&pf_rd_p=8d24f913-1f54-4b4f-bea4-3f55327f02d7&pd_rd_r=d3df32f5-8929-42b4-80ed-157fa1b55a0b&pd_rd_w=pHzbB&pd_rd_wg=yJwoK&ref_=pd_gw_unk");
		pedido.setDescricao("Uma descrição qualquer");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
