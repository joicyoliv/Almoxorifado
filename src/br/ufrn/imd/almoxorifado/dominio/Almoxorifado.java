package br.ufrn.imd.almoxorifado.dominio;

import java.util.List;

/**
 * Classe que representa um almoxorifado
 * @author joicy
 *
 */
public class Almoxorifado {
	
	private String nome;
	private Usuario chefe;
	private List<TipoMaterial> tiposMateriais;
	private List<Usuario> usuariosAlmoxorifado;
	private boolean enderecado;
	private List<LocalizacaoAlmoxorifado> localizacoes;
	
	public Almoxorifado() {}

	public Almoxorifado(String nome, Usuario chefe, List<TipoMaterial> tiposMateriais,
			List<Usuario> usuariosAlmoxorifado, boolean enderecado, List<LocalizacaoAlmoxorifado> localizacoes) {
		this.nome = nome;
		this.chefe = chefe;
		this.tiposMateriais = tiposMateriais;
		this.usuariosAlmoxorifado = usuariosAlmoxorifado;
		this.enderecado = enderecado;
		this.localizacoes = localizacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getChefe() {
		return chefe;
	}

	public void setChefe(Usuario chefe) {
		this.chefe = chefe;
	}

	public List<TipoMaterial> getTiposMateriais() {
		return tiposMateriais;
	}

	public void setTiposMateriais(List<TipoMaterial> tiposMateriais) {
		this.tiposMateriais = tiposMateriais;
	}

	public List<Usuario> getUsuariosAlmoxorifado() {
		return usuariosAlmoxorifado;
	}

	public void setUsuariosAlmoxorifado(List<Usuario> usuariosAlmoxorifado) {
		this.usuariosAlmoxorifado = usuariosAlmoxorifado;
	}

	public boolean isEnderecado() {
		return enderecado;
	}

	public void setEnderecado(boolean enderecado) {
		this.enderecado = enderecado;
	}

	public List<LocalizacaoAlmoxorifado> getLocalizacoes() {
		return localizacoes;
	}

	public void setLocalizacoes(List<LocalizacaoAlmoxorifado> localizacoes) {
		this.localizacoes = localizacoes;
	}

	@Override
	public String toString() {
		return "Almoxorifado [nome=" + nome + ", chefe=" + chefe + ", tiposMateriais=" + tiposMateriais
				+ ", usuariosAlmoxorifado=" + usuariosAlmoxorifado + ", enderecado=" + enderecado + ", localizacoes="
				+ localizacoes + "]";
	}
	
	
	

}
