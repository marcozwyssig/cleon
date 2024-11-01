package cleon.common.language.metamodel.refactoring;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import cleon.common.language.metamodel.spec.FunctionSpace_Language.IAbstractTranslationFunctions;
import cleon.common.language.metamodel.spec.translation.TranslationPackage;
import cleon.common.language.metamodel.spec.translation.javamodel.IAbstractTranslation;

public class SetMD5OnTranslation extends AbstractAllInstancesRefactorerAspect {

	public SetMD5OnTranslation() {
		super("1.0", 2024, 11, 29, "Set MD5 for translation", TranslationPackage.AbstractTranslation);
	}

	@Override
	protected void refactor(IModifiable executor, Package _package, INode translationNode) {
		final var typeSystem = TypeSystem.create(executor);
		final var resourceRepository = typeSystem.getResourceRepository();

		final var translation = resourceRepository.getResource(IAbstractTranslation.class, translationNode);
		if( translation.selectMd5() == null ) {
			final var function = translation.extension(IAbstractTranslationFunctions.class);
			Update.createOrModifyStatement(executor, _package, translationNode,
					TranslationPackage.AbstractTranslation_md5, LiteralUtil.create(md5Hash(function.OriginText())));						
		}
	}
	
	private static String md5Hash(String input) {
        try {
            // Create an MD5 MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Calculate the MD5 digest for the input string
            byte[] hashInBytes = md.digest(input.getBytes());

            // Convert the byte array into a hex string
            StringBuilder sb = new StringBuilder();
            for (byte b : hashInBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm not available", e);
        }
    }	
}
