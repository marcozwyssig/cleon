package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_mail_relay.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMailRelay extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5f117b05-4ce8-11f0-954b-b579526ae084");
  
  // attributes
  
  public java.lang.String selectVirthost();
  
  public java.lang.String selectFrom_domain();
  
  public java.lang.String selectSender_domain();
  
  public java.lang.String selectAllowed_domains_content();
  
  public java.lang.String selectVrrp_inst_state();
  
  public java.lang.Integer selectVrrp_prio();
  
  public java.util.List<java.lang.String> selectFwd_dns_addresses();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5f117b05-4ce8-11f0-954b-b579526ae084,K/WkU9vNaaqq2nVOGXOh29XCENE=] */
