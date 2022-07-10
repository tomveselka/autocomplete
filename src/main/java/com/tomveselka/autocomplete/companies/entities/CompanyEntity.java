package com.tomveselka.autocomplete.companies.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

//https://www.czso.cz/csu/czso/registr-ekonomickych-subjektu-otevrena-data-dokumentace
@Entity
@Table(name = "res_data")
public class CompanyEntity {

		@Id
		@Column(name = "ICO")
		private String ico;
		
		@Column(name = "OKRESLAU")
		private String okreslau;
		
		@Column(name = "DDATVZN")
		private String ddatvzn;
		
		@Column(name = "DDATZAN")
		private String ddatzan;
		
		@Column(name = "ZPZAN")
		private String zpzan;
		
		@Column(name = "DDATPAKT")
		private String ddatpakt;
		
		@Column(name = "FORMA")
		private String forma;
		
		@Column(name = "ROSFORMA")
		private String rosforma;
		
		@Column(name = "KATPO")
		private String katpo;
		
		@Column(name = "NACE")
		private String nace;
		
		@Column(name = "ICZUJ")
		private String iczuj;
		
		@Column(name = "FIRMA")
		private String firma;
		
		@Column(name = "CISS2010")
		private String ciss2010;
		
		@Column(name = "KODADM")
		private String kodadm;
		
		@Column(name = "TEXTADR")
		private String textadr;

		@Column(name = "PSC")
		private String psc;
		
		@Column(name = "OBEC_TEXT")
		private String obecText;
		
		@Column(name = "COBCE_TEXT")
		private String cobceText;
		
		@Column(name = "ULICE_TEXT")
		private String uliceText;
		
		@Column(name = "TYPCDOM")
		private String typcdom;
		
		@Column(name = "CDOM")
		private String cdom;
		
		@Column(name = "COR")
		private String cor;
		
		@Column(name = "DATPLAT")
		private String datplat;
		
		@Column(name = "PRIZNAK")
		private String priznak;
		
		//because I always forget
		//name = this table just column name, referencedColumnName = other table, just column name
		@ManyToOne
		@NotFound(action = NotFoundAction.IGNORE) 
		@JoinColumn(name="ROSFORMA", referencedColumnName = "CHODNOTA", insertable=false, updatable=false)
		private CompanyFormEntity formEntity;
		
		
		@ManyToOne
		@NotFound(action = NotFoundAction.IGNORE) 
		@JoinColumn(name="KATPO", referencedColumnName = "CHODNOTA", insertable=false, updatable=false)
		private NumberOfEmplyEntity employeeEntity;

		/*
		@ManyToOne
		@NotFound(action = NotFoundAction.IGNORE) 
		@JoinColumn(name="NACE", referencedColumnName = "CHODNOTA", insertable=false, updatable=false)
		private NaceEntity naceEntity;
		*/
		public String getIco() {
			return ico;
		}

		public void setIco(String ico) {
			this.ico = ico;
		}

		public String getOkreslau() {
			return okreslau;
		}

		public void setOkreslau(String okreslau) {
			this.okreslau = okreslau;
		}

		public String getDdatvzn() {
			return ddatvzn;
		}

		public void setDdatvzn(String ddatvzn) {
			this.ddatvzn = ddatvzn;
		}

		public String getDdatzan() {
			return ddatzan;
		}

		public void setDdatzan(String ddatzan) {
			this.ddatzan = ddatzan;
		}

		public String getZpzan() {
			return zpzan;
		}

		public void setZpzan(String zpzan) {
			this.zpzan = zpzan;
		}

		public String getDdatpakt() {
			return ddatpakt;
		}

		public void setDdatpakt(String ddatpakt) {
			this.ddatpakt = ddatpakt;
		}

		public String getForma() {
			return forma;
		}

		public void setForma(String forma) {
			this.forma = forma;
		}

		public String getRosforma() {
			return rosforma;
		}

		public void setRosforma(String rosforma) {
			this.rosforma = rosforma;
		}

		public String getKatpo() {
			return katpo;
		}

		public void setKatpo(String katpo) {
			this.katpo = katpo;
		}

		public String getNace() {
			return nace;
		}

		public void setNace(String nace) {
			this.nace = nace;
		}

		public String getIczuj() {
			return iczuj;
		}

		public void setIczuj(String iczuj) {
			this.iczuj = iczuj;
		}

		public String getFirma() {
			return firma;
		}

		public void setFirma(String firma) {
			this.firma = firma;
		}

		public String getCiss2010() {
			return ciss2010;
		}

		public void setCiss2010(String ciss2010) {
			this.ciss2010 = ciss2010;
		}

		public String getKodadm() {
			return kodadm;
		}

		public void setKodadm(String kodadm) {
			this.kodadm = kodadm;
		}

		public String getTextadr() {
			return textadr;
		}

		public void setTextadr(String textadr) {
			this.textadr = textadr;
		}

		public String getPsc() {
			return psc;
		}

		public void setPsc(String psc) {
			this.psc = psc;
		}

		public String getObecText() {
			return obecText;
		}

		public void setObecText(String obecText) {
			this.obecText = obecText;
		}

		public String getCobceText() {
			return cobceText;
		}

		public void setCobceText(String cobceText) {
			this.cobceText = cobceText;
		}

		public String getUliceText() {
			return uliceText;
		}

		public void setUliceText(String uliceText) {
			this.uliceText = uliceText;
		}

		public String getTypcdom() {
			return typcdom;
		}

		public void setTypcdom(String typcdom) {
			this.typcdom = typcdom;
		}

		public String getCdom() {
			return cdom;
		}

		public void setCdom(String cdom) {
			this.cdom = cdom;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getDatplat() {
			return datplat;
		}

		public void setDatplat(String datplat) {
			this.datplat = datplat;
		}

		public String getPriznak() {
			return priznak;
		}

		public void setPriznak(String priznak) {
			this.priznak = priznak;
		}

		@Override
		public String toString() {
			return "CompanyEntity [ico=" + ico + ", okreslau=" + okreslau + ", ddatvzn=" + ddatvzn + ", ddatzan="
					+ ddatzan + ", zpzan=" + zpzan + ", ddatpakt=" + ddatpakt + ", forma=" + forma + ", rosforma="
					+ rosforma + ", katpo=" + katpo + ", nace=" + nace + ", iczuj=" + iczuj + ", firma=" + firma
					+ ", ciss2010=" + ciss2010 + ", kodadm=" + kodadm + ", textadr=" + textadr + ", psc=" + psc
					+ ", obecText=" + obecText + ", cobceText=" + cobceText + ", uliceText=" + uliceText + ", typcdom="
					+ typcdom + ", cdom=" + cdom + ", cor=" + cor + ", datplat=" + datplat + ", priznak=" + priznak
					+ "]";
		}

		public CompanyFormEntity getFormEntity() {
			return formEntity;
		}

		public void setFormEntity(CompanyFormEntity formEntity) {
			this.formEntity = formEntity;
		}

		public NumberOfEmplyEntity getEmployeeEntity() {
			return employeeEntity;
		}

		public void setEmployeeEntity(NumberOfEmplyEntity employeeEntity) {
			this.employeeEntity = employeeEntity;
		}


}
