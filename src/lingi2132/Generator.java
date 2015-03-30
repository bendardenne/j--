package lingi2132;

import java.util.ArrayList;
import static jminusminus.CLConstants.*;
import jminusminus.CLEmitter;

public class Generator extends FibonacciGenerator{

	public Generator(String outputDir){
		super(outputDir);
	}
	
	public void generateClass(){
		
		// Initialization of CLEmitter
		CLEmitter cle = new CLEmitter(true);
		cle.destinationDir(this.outputDir);
		
		
		// Code
		ArrayList<String> accessFlags = new ArrayList<String>();
		
		accessFlags.add("public");//public
		cle.addClass(accessFlags, "packageOfClassToGenerate/ClassToGenerate", "java/lang/Object", null, false);
		
		
		cle.addMethod(accessFlags, "<init>","()V",null, false);
		cle.addNoArgInstruction(ALOAD_0);
		cle.addMemberAccessInstruction(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
		cle.addNoArgInstruction(RETURN);
		
		accessFlags.add("static");//public static
		cle.addMethod(accessFlags, "fibonacci", "(I)I", null,false);
		
		cle.addNoArgInstruction(ILOAD_0);
		cle.addNoArgInstruction(ICONST_2);
		cle.addBranchInstruction(IF_ICMPGE, "l10");
		cle.addNoArgInstruction(ILOAD_0);
		cle.addNoArgInstruction(IRETURN);
		cle.addBranchInstruction(GOTO, "l24");
		cle.addLabel("l10");
		cle.addNoArgInstruction(ILOAD_0);
		cle.addNoArgInstruction(ICONST_1);
		cle.addNoArgInstruction(ISUB);
		cle.addMemberAccessInstruction(INVOKESTATIC, "packageOfClassToGenerate/ClassToGenerate", "fibonacci", "(I)I");
		cle.addNoArgInstruction(ILOAD_0);
		cle.addNoArgInstruction(ICONST_2);
		cle.addNoArgInstruction(ISUB);
		
		cle.addMemberAccessInstruction(INVOKESTATIC, "packageOfClassToGenerate/ClassToGenerate", "fibonacci", "(I)I");
		cle.addNoArgInstruction(IADD);
		cle.addNoArgInstruction(IRETURN);
		cle.addLabel("l24");
		cle.addNoArgInstruction(NOP);
		
		// Write the file.
		cle.write();
		
	}

}
