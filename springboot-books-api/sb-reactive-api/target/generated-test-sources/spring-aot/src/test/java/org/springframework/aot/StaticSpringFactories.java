package org.springframework.aot;

import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.util.function.Supplier;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.SpringBootExceptionReporter;
import org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationImportFilter;
import org.springframework.boot.autoconfigure.AutoConfigurationImportListener;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.config.ConfigDataLocationResolver;
import org.springframework.boot.context.config._FactoryProvider;
import org.springframework.boot.diagnostics.FailureAnalyzer;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.test.autoconfigure.data.cassandra.AutoConfigureDataCassandra;
import org.springframework.boot.test.autoconfigure.data.ldap.AutoConfigureDataLdap;
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
import org.springframework.boot.test.autoconfigure.data.r2dbc.AutoConfigureDataR2dbc;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebFlux;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.DefaultTestExecutionListenersPostProcessor;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.data.r2dbc.dialect.DialectResolver;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;
import org.springframework.r2dbc.core.binding.BindMarkersFactoryResolver;
import org.springframework.test.context.ContextCustomizerFactory;
import org.springframework.test.context.TestExecutionListener;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * Class generated - do not edit this file
 */
public abstract class StaticSpringFactories {
  public static MultiValueMap<Class, Supplier<Object>> factories = new LinkedMultiValueMap();

  public static MultiValueMap<Class, String> names = new LinkedMultiValueMap();

  static {
    System.setProperty("spring.xml.ignore", "true");
    factories.add(org.springframework.boot.diagnostics.FailureAnalysisReporter.class, () -> new org.springframework.boot.diagnostics.LoggingFailureAnalysisReporter());
    factories.add(FailureAnalyzer.class, () -> _FactoryProvider.configDataNotFoundFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.context.properties._FactoryProvider.incompatibleConfigurationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.context.properties._FactoryProvider.notConstructorBoundInjectionFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.beanCurrentlyInCreationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.beanDefinitionOverrideFailureAnalyzer());
    factories.add(org.springframework.boot.diagnostics.FailureAnalyzer.class, () -> new org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.bindFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.bindValidationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.unboundConfigurationPropertyFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.connectorStartFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.noSuchMethodFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.noUniqueBeanDefinitionFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.portInUseFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.invalidConfigurationPropertyNameFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.invalidConfigurationPropertyValueFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.patternParseFailureAnalyzer());
    names.add(SpringBootExceptionReporter.class, "org.springframework.boot.diagnostics.FailureAnalyzers");
    names.add(SpringApplicationRunListener.class, "org.springframework.boot.context.event.EventPublishingRunListener");
    factories.add(ApplicationListener.class, () -> org.springframework.boot._FactoryProvider.clearCachesApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.builder.ParentContextCloserApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.context.FileEncodingApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.context.config.AnsiOutputApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.context.config.DelegatingApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.context.logging.LoggingApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.env.EnvironmentPostProcessorApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.liquibase.LiquibaseServiceLocatorApplicationListener());
    factories.add(org.springframework.boot.logging.LoggingSystemFactory.class, () -> new org.springframework.boot.logging.logback.LogbackLoggingSystem.Factory());
    factories.add(org.springframework.boot.logging.LoggingSystemFactory.class, () -> new org.springframework.boot.logging.log4j2.Log4J2LoggingSystem.Factory());
    factories.add(org.springframework.boot.logging.LoggingSystemFactory.class, () -> new org.springframework.boot.logging.java.JavaLoggingSystem.Factory());
    names.add(ConfigDataLocationResolver.class, "org.springframework.boot.context.config.ConfigTreeConfigDataLocationResolver");
    names.add(ConfigDataLocationResolver.class, "org.springframework.boot.context.config.StandardConfigDataLocationResolver");
    factories.add(org.springframework.boot.env.PropertySourceLoader.class, () -> new org.springframework.boot.env.PropertiesPropertySourceLoader());
    factories.add(org.springframework.boot.env.PropertySourceLoader.class, () -> new org.springframework.boot.env.YamlPropertySourceLoader());
    factories.add(org.springframework.boot.context.config.ConfigDataLoader.class, () -> new org.springframework.boot.context.config.ConfigTreeConfigDataLoader());
    factories.add(org.springframework.boot.context.config.ConfigDataLoader.class, () -> new org.springframework.boot.context.config.StandardConfigDataLoader());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.context.ConfigurationWarningsApplicationContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.context.ContextIdApplicationContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.context.config.DelegatingApplicationContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.rsocket.context.RSocketPortInfoApplicationContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.web.context.ServerPortInfoApplicationContextInitializer());
    factories.add(org.springframework.boot.env.EnvironmentPostProcessor.class, () -> new org.springframework.boot.cloud.CloudFoundryVcapEnvironmentPostProcessor());
    names.add(EnvironmentPostProcessor.class, "org.springframework.boot.context.config.ConfigDataEnvironmentPostProcessor");
    names.add(EnvironmentPostProcessor.class, "org.springframework.boot.env.RandomValuePropertySourceEnvironmentPostProcessor");
    factories.add(org.springframework.boot.env.EnvironmentPostProcessor.class, () -> new org.springframework.boot.env.SpringApplicationJsonEnvironmentPostProcessor());
    factories.add(org.springframework.boot.env.EnvironmentPostProcessor.class, () -> new org.springframework.boot.env.SystemEnvironmentPropertySourceEnvironmentPostProcessor());
    factories.add(org.springframework.boot.env.EnvironmentPostProcessor.class, () -> new org.springframework.boot.reactor.DebugAgentEnvironmentPostProcessor());
    factories.add(AutoConfigurationImportListener.class, () -> org.springframework.boot.autoconfigure.condition._FactoryProvider.conditionEvaluationReportAutoConfigurationImportListener());
    factories.add(AutoConfigurationImportFilter.class, () -> org.springframework.boot.autoconfigure.condition._FactoryProvider.onBeanCondition());
    factories.add(AutoConfigurationImportFilter.class, () -> org.springframework.boot.autoconfigure.condition._FactoryProvider.onClassCondition());
    factories.add(AutoConfigurationImportFilter.class, () -> org.springframework.boot.autoconfigure.condition._FactoryProvider.onWebApplicationCondition());
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.aop.AopAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.data.r2dbc.R2dbcDataAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.data.r2dbc.R2dbcRepositoriesAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.r2dbc.R2dbcTransactionManagerAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.web.reactive.error.ErrorWebFluxAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.web.reactive.function.client.ClientHttpConnectorAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration");
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.data.redis._FactoryProvider.redisUrlSyntaxFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.diagnostics.analyzer._FactoryProvider.noSuchBeanDefinitionFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.flyway._FactoryProvider.flywayMigrationScriptMissingFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.jdbc._FactoryProvider.dataSourceBeanCreationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.r2dbc._FactoryProvider.connectionFactoryBeanCreationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.session._FactoryProvider.nonUniqueSessionRepositoryFailureAnalyzer());
    factories.add(ApplicationContextInitializer.class, () -> org.springframework.boot.autoconfigure._FactoryProvider.sharedMetadataReaderFactoryContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener());
    factories.add(DialectResolver.R2dbcDialectProvider.class, () -> org.springframework.data.r2dbc.dialect._FactoryProvider.dialectResolverBuiltInDialectProvider());
    names.add(RepositoryFactorySupport.class, "org.springframework.data.r2dbc.repository.support.R2dbcRepositoryFactory");
    factories.add(org.springframework.data.web.config.SpringDataJacksonModules.class, () -> new org.springframework.data.web.config.SpringDataJacksonConfiguration());
    factories.add(BindMarkersFactoryResolver.BindMarkerFactoryProvider.class, () -> org.springframework.r2dbc.core.binding._FactoryProvider.bindMarkersFactoryResolverBuiltInBindMarkersFactoryProvider());
    factories.add(org.springframework.beans.BeanInfoFactory.class, () -> new org.springframework.beans.ExtendedBeanInfoFactory());
    factories.add(org.springframework.test.context.TestExecutionListener.class, () -> new org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener());
    factories.add(org.springframework.test.context.TestExecutionListener.class, () -> new org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.context._FactoryProvider.importsContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.context.filter._FactoryProvider.excludeFilterContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.json._FactoryProvider.duplicateJsonObjectContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.mock.mockito._FactoryProvider.mockitoContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.web.client._FactoryProvider.testRestTemplateContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.web.reactive.server._FactoryProvider.webTestClientContextCustomizerFactory());
    factories.add(EnvironmentPostProcessor.class, () -> org.springframework.boot.test.web._FactoryProvider.springBootTestRandomPortEnvironmentPostProcessor());
    factories.add(org.springframework.boot.test.autoconfigure.data.r2dbc.AutoConfigureDataR2dbc.class, () -> new org.springframework.boot.autoconfigure.data.r2dbc.R2dbcRepositoriesAutoConfiguration());
    names.add(AutoConfigureDataR2dbc.class, "org.springframework.boot.autoconfigure.data.r2dbc.R2dbcDataAutoConfiguration");
    factories.add(org.springframework.boot.test.autoconfigure.data.r2dbc.AutoConfigureDataR2dbc.class, () -> new org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.data.r2dbc.AutoConfigureDataR2dbc.class, () -> new org.springframework.boot.autoconfigure.r2dbc.R2dbcTransactionManagerAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.data.r2dbc.AutoConfigureDataR2dbc.class, () -> new org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc.class, () -> new org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration());
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration");
    factories.add(org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc.class, () -> new org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc.class, () -> new org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration());
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.mustache.MustacheAutoConfiguration");
    factories.add(org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc.class, () -> new org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration());
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration");
    factories.add(org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa.class, () -> new org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.jooq.AutoConfigureJooq.class, () -> new org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration());
    factories.add(org.springframework.test.context.TestExecutionListener.class, () -> new org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener());
    factories.add(TestExecutionListener.class, () -> org.springframework.boot.test.autoconfigure.web.client._FactoryProvider.mockRestServiceServerResetTestExecutionListener());
    factories.add(TestExecutionListener.class, () -> org.springframework.boot.test.autoconfigure.web.servlet._FactoryProvider.mockMvcPrintOnlyOnFailureTestExecutionListener());
    factories.add(TestExecutionListener.class, () -> org.springframework.boot.test.autoconfigure.web.servlet._FactoryProvider.webDriverTestExecutionListener());
    factories.add(org.springframework.test.context.TestExecutionListener.class, () -> new org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener());
    factories.add(org.springframework.boot.test.autoconfigure.json.AutoConfigureJson.class, () -> new org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.core.AutoConfigureCache.class, () -> new org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration());
    names.add(AutoConfigureDataMongo.class, "org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration");
    factories.add(org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo.class, () -> new org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.web.client.AutoConfigureMockRestServiceServer.class, () -> new org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.data.jdbc.AutoConfigureDataJdbc.class, () -> new org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs.class, () -> new org.springframework.boot.test.autoconfigure.restdocs.RestDocsAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient.class, () -> new org.springframework.boot.test.autoconfigure.web.client.WebClientRestTemplateAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient.class, () -> new org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient.class, () -> new org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient.class, () -> new org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient.class, () -> new org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient.class, () -> new org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.autoconfigure._FactoryProvider.overrideAutoConfigurationContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.autoconfigure.actuate.metrics._FactoryProvider.metricsExportContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.autoconfigure.filter._FactoryProvider.typeExcludeFiltersContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.autoconfigure.properties._FactoryProvider.propertyMappingContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.autoconfigure.web.servlet._FactoryProvider.webDriverContextCustomizerFactory());
    factories.add(org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters.class, () -> new org.springframework.boot.test.autoconfigure.json.JsonTestersAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters.class, () -> new org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration());
    names.add(AutoConfigureDataCassandra.class, "org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration");
    names.add(AutoConfigureMockMvc.class, "org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration");
    factories.add(org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.class, () -> new org.springframework.boot.test.autoconfigure.jdbc.TestDatabaseAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.data.neo4j.AutoConfigureDataNeo4j.class, () -> new org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration());
    names.add(AutoConfigureDataLdap.class, "org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapAutoConfiguration");
    factories.add(org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient.class, () -> new org.springframework.boot.test.autoconfigure.web.reactive.WebTestClientAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureJdbc.class, () -> new org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration());
    factories.add(org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebFlux.class, () -> new org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration());
    names.add(AutoConfigureWebFlux.class, "org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration");
    factories.add(org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebFlux.class, () -> new org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration());
    names.add(AutoConfigureWebFlux.class, "org.springframework.boot.autoconfigure.mustache.MustacheAutoConfiguration");
    factories.add(org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebFlux.class, () -> new org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration());
    names.add(AutoConfigureWebFlux.class, "org.springframework.boot.autoconfigure.web.reactive.error.ErrorWebFluxAutoConfiguration");
    factories.add(DefaultTestExecutionListenersPostProcessor.class, () -> org.springframework.boot.test.autoconfigure._FactoryProvider.springBootDependencyInjectionTestExecutionListenerPostProcessor());
    factories.add(org.springframework.test.context.TestExecutionListener.class, () -> new org.springframework.test.context.web.ServletTestExecutionListener());
    factories.add(org.springframework.test.context.TestExecutionListener.class, () -> new org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener());
    factories.add(org.springframework.test.context.TestExecutionListener.class, () -> new org.springframework.test.context.event.ApplicationEventsTestExecutionListener());
    factories.add(org.springframework.test.context.TestExecutionListener.class, () -> new org.springframework.test.context.support.DependencyInjectionTestExecutionListener());
    factories.add(org.springframework.test.context.TestExecutionListener.class, () -> new org.springframework.test.context.support.DirtiesContextTestExecutionListener());
    factories.add(org.springframework.test.context.TestExecutionListener.class, () -> new org.springframework.test.context.transaction.TransactionalTestExecutionListener());
    factories.add(org.springframework.test.context.TestExecutionListener.class, () -> new org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener());
    factories.add(org.springframework.test.context.TestExecutionListener.class, () -> new org.springframework.test.context.event.EventPublishingTestExecutionListener());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.test.context.web.socket._FactoryProvider.mockServerContainerContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.test.context.support._FactoryProvider.dynamicPropertiesContextCustomizerFactory());
    factories.add(org.springframework.boot.diagnostics.FailureAnalyzer.class, () -> new org.springframework.nativex.GeneratedClassNotFoundExceptionFailureAnalyzer());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.nativex.NativeListener());
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.audit.AuditAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.audit.AuditEventsEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.availability.AvailabilityHealthContributorAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.availability.AvailabilityProbesAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.beans.BeansEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.cache.CachesEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.ReactiveCloudFoundryActuatorAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.context.properties.ConfigurationPropertiesReportEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.context.ShutdownEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.env.EnvironmentEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.health.HealthContributorAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.health.HealthEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.info.InfoContributorAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.info.InfoEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.logging.LogFileWebEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.logging.LoggersEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.management.HeapDumpWebEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.management.ThreadDumpEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.CompositeMeterRegistryAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.JvmMetricsAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.LogbackMetricsAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.MetricsAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.MetricsEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.cache.CacheMetricsAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.export.prometheus.PrometheusMetricsExportAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.export.simple.SimpleMetricsExportAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.integration.IntegrationMetricsAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.jdbc.DataSourcePoolMetricsAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.r2dbc.ConnectionPoolMetricsAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.web.client.HttpClientMetricsAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.metrics.web.reactive.WebFluxMetricsAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.r2dbc.ConnectionFactoryHealthContributorAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.scheduling.ScheduledTasksEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.startup.StartupEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.system.DiskSpaceHealthContributorAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.trace.http.HttpTraceAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.trace.http.HttpTraceEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.web.mappings.MappingsEndpointAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.web.reactive.ReactiveManagementContextAutoConfiguration");
    names.add(EnableAutoConfiguration.class, "org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration");
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.actuate.autoconfigure.metrics._FactoryProvider.validationFailureAnalyzer());
    factories.add(org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration.class, () -> new org.springframework.boot.actuate.autoconfigure.endpoint.web.ServletEndpointManagementContextConfiguration());
    factories.add(org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration.class, () -> new org.springframework.boot.actuate.autoconfigure.endpoint.web.reactive.WebFluxEndpointManagementContextConfiguration());
    factories.add(org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration.class, () -> new org.springframework.boot.actuate.autoconfigure.web.reactive.ReactiveManagementChildContextConfiguration());
    factories.add(ManagementContextConfiguration.class, () -> org.springframework.boot.actuate.autoconfigure.web.servlet._FactoryProvider.servletManagementChildContextConfiguration());
  }
}