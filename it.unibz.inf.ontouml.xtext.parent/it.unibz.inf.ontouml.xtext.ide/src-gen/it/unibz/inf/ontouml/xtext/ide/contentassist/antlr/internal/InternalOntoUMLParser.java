package it.unibz.inf.ontouml.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import it.unibz.inf.ontouml.xtext.services.OntoUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntoUMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'none'", "'kind'", "'relatorKind'", "'modeKind'", "'qualityKind'", "'subkind'", "'role'", "'phase'", "'category'", "'mixin'", "'roleMixin'", "'phaseMixin'", "'Model'", "'{'", "'}'", "','", "'.'", "'Package'", "'Class'", "'Generalization'", "'superclass'", "'subclass'", "'GeneralizationSet'", "'generalizations'", "'disjoint'", "'complete'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalOntoUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOntoUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOntoUMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOntoUML.g"; }


    	private OntoUMLGrammarAccess grammarAccess;

    	public void setGrammarAccess(OntoUMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalOntoUML.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalOntoUML.g:54:1: ( ruleModel EOF )
            // InternalOntoUML.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOntoUML.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalOntoUML.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalOntoUML.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalOntoUML.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalOntoUML.g:69:3: ( rule__Model__Group__0 )
            // InternalOntoUML.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalOntoUML.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalOntoUML.g:79:1: ( ruleQualifiedName EOF )
            // InternalOntoUML.g:80:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalOntoUML.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalOntoUML.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalOntoUML.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalOntoUML.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalOntoUML.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalOntoUML.g:94:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleModelElement"
    // InternalOntoUML.g:103:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // InternalOntoUML.g:104:1: ( ruleModelElement EOF )
            // InternalOntoUML.g:105:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalOntoUML.g:112:1: ruleModelElement : ( ( rule__ModelElement__Alternatives ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:116:2: ( ( ( rule__ModelElement__Alternatives ) ) )
            // InternalOntoUML.g:117:2: ( ( rule__ModelElement__Alternatives ) )
            {
            // InternalOntoUML.g:117:2: ( ( rule__ModelElement__Alternatives ) )
            // InternalOntoUML.g:118:3: ( rule__ModelElement__Alternatives )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives()); 
            // InternalOntoUML.g:119:3: ( rule__ModelElement__Alternatives )
            // InternalOntoUML.g:119:4: rule__ModelElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRulePackage"
    // InternalOntoUML.g:128:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalOntoUML.g:129:1: ( rulePackage EOF )
            // InternalOntoUML.g:130:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalOntoUML.g:137:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:141:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalOntoUML.g:142:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalOntoUML.g:142:2: ( ( rule__Package__Group__0 ) )
            // InternalOntoUML.g:143:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalOntoUML.g:144:3: ( rule__Package__Group__0 )
            // InternalOntoUML.g:144:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleOntoUMLClass"
    // InternalOntoUML.g:153:1: entryRuleOntoUMLClass : ruleOntoUMLClass EOF ;
    public final void entryRuleOntoUMLClass() throws RecognitionException {
        try {
            // InternalOntoUML.g:154:1: ( ruleOntoUMLClass EOF )
            // InternalOntoUML.g:155:1: ruleOntoUMLClass EOF
            {
             before(grammarAccess.getOntoUMLClassRule()); 
            pushFollow(FOLLOW_1);
            ruleOntoUMLClass();

            state._fsp--;

             after(grammarAccess.getOntoUMLClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOntoUMLClass"


    // $ANTLR start "ruleOntoUMLClass"
    // InternalOntoUML.g:162:1: ruleOntoUMLClass : ( ( rule__OntoUMLClass__Group__0 ) ) ;
    public final void ruleOntoUMLClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:166:2: ( ( ( rule__OntoUMLClass__Group__0 ) ) )
            // InternalOntoUML.g:167:2: ( ( rule__OntoUMLClass__Group__0 ) )
            {
            // InternalOntoUML.g:167:2: ( ( rule__OntoUMLClass__Group__0 ) )
            // InternalOntoUML.g:168:3: ( rule__OntoUMLClass__Group__0 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup()); 
            // InternalOntoUML.g:169:3: ( rule__OntoUMLClass__Group__0 )
            // InternalOntoUML.g:169:4: rule__OntoUMLClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOntoUMLClass"


    // $ANTLR start "entryRuleGeneralization"
    // InternalOntoUML.g:178:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalOntoUML.g:179:1: ( ruleGeneralization EOF )
            // InternalOntoUML.g:180:1: ruleGeneralization EOF
            {
             before(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralization();

            state._fsp--;

             after(grammarAccess.getGeneralizationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalOntoUML.g:187:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:191:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalOntoUML.g:192:2: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalOntoUML.g:192:2: ( ( rule__Generalization__Group__0 ) )
            // InternalOntoUML.g:193:3: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalOntoUML.g:194:3: ( rule__Generalization__Group__0 )
            // InternalOntoUML.g:194:4: rule__Generalization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoUML.g:203:1: entryRuleGeneralizationSet : ruleGeneralizationSet EOF ;
    public final void entryRuleGeneralizationSet() throws RecognitionException {
        try {
            // InternalOntoUML.g:204:1: ( ruleGeneralizationSet EOF )
            // InternalOntoUML.g:205:1: ruleGeneralizationSet EOF
            {
             before(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneralizationSet();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // InternalOntoUML.g:212:1: ruleGeneralizationSet : ( ( rule__GeneralizationSet__Group__0 ) ) ;
    public final void ruleGeneralizationSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:216:2: ( ( ( rule__GeneralizationSet__Group__0 ) ) )
            // InternalOntoUML.g:217:2: ( ( rule__GeneralizationSet__Group__0 ) )
            {
            // InternalOntoUML.g:217:2: ( ( rule__GeneralizationSet__Group__0 ) )
            // InternalOntoUML.g:218:3: ( rule__GeneralizationSet__Group__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup()); 
            // InternalOntoUML.g:219:3: ( rule__GeneralizationSet__Group__0 )
            // InternalOntoUML.g:219:4: rule__GeneralizationSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "ruleEndurantType"
    // InternalOntoUML.g:228:1: ruleEndurantType : ( ( rule__EndurantType__Alternatives ) ) ;
    public final void ruleEndurantType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:232:1: ( ( ( rule__EndurantType__Alternatives ) ) )
            // InternalOntoUML.g:233:2: ( ( rule__EndurantType__Alternatives ) )
            {
            // InternalOntoUML.g:233:2: ( ( rule__EndurantType__Alternatives ) )
            // InternalOntoUML.g:234:3: ( rule__EndurantType__Alternatives )
            {
             before(grammarAccess.getEndurantTypeAccess().getAlternatives()); 
            // InternalOntoUML.g:235:3: ( rule__EndurantType__Alternatives )
            // InternalOntoUML.g:235:4: rule__EndurantType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EndurantType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEndurantTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndurantType"


    // $ANTLR start "rule__ModelElement__Alternatives"
    // InternalOntoUML.g:243:1: rule__ModelElement__Alternatives : ( ( rulePackage ) | ( ruleOntoUMLClass ) | ( ruleGeneralization ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:247:1: ( ( rulePackage ) | ( ruleOntoUMLClass ) | ( ruleGeneralization ) | ( ruleGeneralizationSet ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt1=2;
                }
                break;
            case 30:
                {
                alt1=3;
                }
                break;
            case 35:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalOntoUML.g:248:2: ( rulePackage )
                    {
                    // InternalOntoUML.g:248:2: ( rulePackage )
                    // InternalOntoUML.g:249:3: rulePackage
                    {
                     before(grammarAccess.getModelElementAccess().getPackageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getPackageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:254:2: ( ruleOntoUMLClass )
                    {
                    // InternalOntoUML.g:254:2: ( ruleOntoUMLClass )
                    // InternalOntoUML.g:255:3: ruleOntoUMLClass
                    {
                     before(grammarAccess.getModelElementAccess().getOntoUMLClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOntoUMLClass();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getOntoUMLClassParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:260:2: ( ruleGeneralization )
                    {
                    // InternalOntoUML.g:260:2: ( ruleGeneralization )
                    // InternalOntoUML.g:261:3: ruleGeneralization
                    {
                     before(grammarAccess.getModelElementAccess().getGeneralizationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralization();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getGeneralizationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:266:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoUML.g:266:2: ( ruleGeneralizationSet )
                    // InternalOntoUML.g:267:3: ruleGeneralizationSet
                    {
                     before(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralizationSet();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Alternatives"


    // $ANTLR start "rule__EndurantType__Alternatives"
    // InternalOntoUML.g:276:1: rule__EndurantType__Alternatives : ( ( ( 'none' ) ) | ( ( 'kind' ) ) | ( ( 'relatorKind' ) ) | ( ( 'modeKind' ) ) | ( ( 'qualityKind' ) ) | ( ( 'subkind' ) ) | ( ( 'role' ) ) | ( ( 'phase' ) ) | ( ( 'category' ) ) | ( ( 'mixin' ) ) | ( ( 'roleMixin' ) ) | ( ( 'phaseMixin' ) ) );
    public final void rule__EndurantType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:280:1: ( ( ( 'none' ) ) | ( ( 'kind' ) ) | ( ( 'relatorKind' ) ) | ( ( 'modeKind' ) ) | ( ( 'qualityKind' ) ) | ( ( 'subkind' ) ) | ( ( 'role' ) ) | ( ( 'phase' ) ) | ( ( 'category' ) ) | ( ( 'mixin' ) ) | ( ( 'roleMixin' ) ) | ( ( 'phaseMixin' ) ) )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            case 21:
                {
                alt2=11;
                }
                break;
            case 22:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOntoUML.g:281:2: ( ( 'none' ) )
                    {
                    // InternalOntoUML.g:281:2: ( ( 'none' ) )
                    // InternalOntoUML.g:282:3: ( 'none' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getNoneEnumLiteralDeclaration_0()); 
                    // InternalOntoUML.g:283:3: ( 'none' )
                    // InternalOntoUML.g:283:4: 'none'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getNoneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:287:2: ( ( 'kind' ) )
                    {
                    // InternalOntoUML.g:287:2: ( ( 'kind' ) )
                    // InternalOntoUML.g:288:3: ( 'kind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_1()); 
                    // InternalOntoUML.g:289:3: ( 'kind' )
                    // InternalOntoUML.g:289:4: 'kind'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:293:2: ( ( 'relatorKind' ) )
                    {
                    // InternalOntoUML.g:293:2: ( ( 'relatorKind' ) )
                    // InternalOntoUML.g:294:3: ( 'relatorKind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_2()); 
                    // InternalOntoUML.g:295:3: ( 'relatorKind' )
                    // InternalOntoUML.g:295:4: 'relatorKind'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:299:2: ( ( 'modeKind' ) )
                    {
                    // InternalOntoUML.g:299:2: ( ( 'modeKind' ) )
                    // InternalOntoUML.g:300:3: ( 'modeKind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_3()); 
                    // InternalOntoUML.g:301:3: ( 'modeKind' )
                    // InternalOntoUML.g:301:4: 'modeKind'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoUML.g:305:2: ( ( 'qualityKind' ) )
                    {
                    // InternalOntoUML.g:305:2: ( ( 'qualityKind' ) )
                    // InternalOntoUML.g:306:3: ( 'qualityKind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_4()); 
                    // InternalOntoUML.g:307:3: ( 'qualityKind' )
                    // InternalOntoUML.g:307:4: 'qualityKind'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoUML.g:311:2: ( ( 'subkind' ) )
                    {
                    // InternalOntoUML.g:311:2: ( ( 'subkind' ) )
                    // InternalOntoUML.g:312:3: ( 'subkind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_5()); 
                    // InternalOntoUML.g:313:3: ( 'subkind' )
                    // InternalOntoUML.g:313:4: 'subkind'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOntoUML.g:317:2: ( ( 'role' ) )
                    {
                    // InternalOntoUML.g:317:2: ( ( 'role' ) )
                    // InternalOntoUML.g:318:3: ( 'role' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_6()); 
                    // InternalOntoUML.g:319:3: ( 'role' )
                    // InternalOntoUML.g:319:4: 'role'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOntoUML.g:323:2: ( ( 'phase' ) )
                    {
                    // InternalOntoUML.g:323:2: ( ( 'phase' ) )
                    // InternalOntoUML.g:324:3: ( 'phase' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_7()); 
                    // InternalOntoUML.g:325:3: ( 'phase' )
                    // InternalOntoUML.g:325:4: 'phase'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalOntoUML.g:329:2: ( ( 'category' ) )
                    {
                    // InternalOntoUML.g:329:2: ( ( 'category' ) )
                    // InternalOntoUML.g:330:3: ( 'category' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_8()); 
                    // InternalOntoUML.g:331:3: ( 'category' )
                    // InternalOntoUML.g:331:4: 'category'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalOntoUML.g:335:2: ( ( 'mixin' ) )
                    {
                    // InternalOntoUML.g:335:2: ( ( 'mixin' ) )
                    // InternalOntoUML.g:336:3: ( 'mixin' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_9()); 
                    // InternalOntoUML.g:337:3: ( 'mixin' )
                    // InternalOntoUML.g:337:4: 'mixin'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalOntoUML.g:341:2: ( ( 'roleMixin' ) )
                    {
                    // InternalOntoUML.g:341:2: ( ( 'roleMixin' ) )
                    // InternalOntoUML.g:342:3: ( 'roleMixin' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_10()); 
                    // InternalOntoUML.g:343:3: ( 'roleMixin' )
                    // InternalOntoUML.g:343:4: 'roleMixin'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalOntoUML.g:347:2: ( ( 'phaseMixin' ) )
                    {
                    // InternalOntoUML.g:347:2: ( ( 'phaseMixin' ) )
                    // InternalOntoUML.g:348:3: ( 'phaseMixin' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getPhaseMixinEnumLiteralDeclaration_11()); 
                    // InternalOntoUML.g:349:3: ( 'phaseMixin' )
                    // InternalOntoUML.g:349:4: 'phaseMixin'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getPhaseMixinEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndurantType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalOntoUML.g:357:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:361:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOntoUML.g:362:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalOntoUML.g:369:1: rule__Model__Group__0__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:373:1: ( ( 'Model' ) )
            // InternalOntoUML.g:374:1: ( 'Model' )
            {
            // InternalOntoUML.g:374:1: ( 'Model' )
            // InternalOntoUML.g:375:2: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalOntoUML.g:384:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:388:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOntoUML.g:389:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalOntoUML.g:396:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:400:1: ( ( '{' ) )
            // InternalOntoUML.g:401:1: ( '{' )
            {
            // InternalOntoUML.g:401:1: ( '{' )
            // InternalOntoUML.g:402:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalOntoUML.g:411:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:415:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOntoUML.g:416:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalOntoUML.g:423:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementsAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:427:1: ( ( ( rule__Model__ElementsAssignment_2 ) ) )
            // InternalOntoUML.g:428:1: ( ( rule__Model__ElementsAssignment_2 ) )
            {
            // InternalOntoUML.g:428:1: ( ( rule__Model__ElementsAssignment_2 ) )
            // InternalOntoUML.g:429:2: ( rule__Model__ElementsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_2()); 
            // InternalOntoUML.g:430:2: ( rule__Model__ElementsAssignment_2 )
            // InternalOntoUML.g:430:3: rule__Model__ElementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalOntoUML.g:438:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:442:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalOntoUML.g:443:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalOntoUML.g:450:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:454:1: ( ( ( rule__Model__Group_3__0 )* ) )
            // InternalOntoUML.g:455:1: ( ( rule__Model__Group_3__0 )* )
            {
            // InternalOntoUML.g:455:1: ( ( rule__Model__Group_3__0 )* )
            // InternalOntoUML.g:456:2: ( rule__Model__Group_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // InternalOntoUML.g:457:2: ( rule__Model__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOntoUML.g:457:3: rule__Model__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalOntoUML.g:465:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:469:1: ( rule__Model__Group__4__Impl )
            // InternalOntoUML.g:470:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalOntoUML.g:476:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:480:1: ( ( '}' ) )
            // InternalOntoUML.g:481:1: ( '}' )
            {
            // InternalOntoUML.g:481:1: ( '}' )
            // InternalOntoUML.g:482:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_3__0"
    // InternalOntoUML.g:492:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:496:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // InternalOntoUML.g:497:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0"


    // $ANTLR start "rule__Model__Group_3__0__Impl"
    // InternalOntoUML.g:504:1: rule__Model__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:508:1: ( ( ',' ) )
            // InternalOntoUML.g:509:1: ( ',' )
            {
            // InternalOntoUML.g:509:1: ( ',' )
            // InternalOntoUML.g:510:2: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3__1"
    // InternalOntoUML.g:519:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:523:1: ( rule__Model__Group_3__1__Impl )
            // InternalOntoUML.g:524:2: rule__Model__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1"


    // $ANTLR start "rule__Model__Group_3__1__Impl"
    // InternalOntoUML.g:530:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__ElementsAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:534:1: ( ( ( rule__Model__ElementsAssignment_3_1 ) ) )
            // InternalOntoUML.g:535:1: ( ( rule__Model__ElementsAssignment_3_1 ) )
            {
            // InternalOntoUML.g:535:1: ( ( rule__Model__ElementsAssignment_3_1 ) )
            // InternalOntoUML.g:536:2: ( rule__Model__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 
            // InternalOntoUML.g:537:2: ( rule__Model__ElementsAssignment_3_1 )
            // InternalOntoUML.g:537:3: rule__Model__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalOntoUML.g:546:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:550:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalOntoUML.g:551:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalOntoUML.g:558:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:562:1: ( ( RULE_ID ) )
            // InternalOntoUML.g:563:1: ( RULE_ID )
            {
            // InternalOntoUML.g:563:1: ( RULE_ID )
            // InternalOntoUML.g:564:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalOntoUML.g:573:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:577:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalOntoUML.g:578:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalOntoUML.g:584:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:588:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalOntoUML.g:589:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalOntoUML.g:589:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalOntoUML.g:590:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalOntoUML.g:591:2: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOntoUML.g:591:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalOntoUML.g:600:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:604:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalOntoUML.g:605:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalOntoUML.g:612:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:616:1: ( ( '.' ) )
            // InternalOntoUML.g:617:1: ( '.' )
            {
            // InternalOntoUML.g:617:1: ( '.' )
            // InternalOntoUML.g:618:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalOntoUML.g:627:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:631:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalOntoUML.g:632:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalOntoUML.g:638:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:642:1: ( ( RULE_ID ) )
            // InternalOntoUML.g:643:1: ( RULE_ID )
            {
            // InternalOntoUML.g:643:1: ( RULE_ID )
            // InternalOntoUML.g:644:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // InternalOntoUML.g:654:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:658:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalOntoUML.g:659:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalOntoUML.g:666:1: rule__Package__Group__0__Impl : ( 'Package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:670:1: ( ( 'Package' ) )
            // InternalOntoUML.g:671:1: ( 'Package' )
            {
            // InternalOntoUML.g:671:1: ( 'Package' )
            // InternalOntoUML.g:672:2: 'Package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalOntoUML.g:681:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:685:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalOntoUML.g:686:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalOntoUML.g:693:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:697:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalOntoUML.g:698:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalOntoUML.g:698:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalOntoUML.g:699:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalOntoUML.g:700:2: ( rule__Package__NameAssignment_1 )
            // InternalOntoUML.g:700:3: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalOntoUML.g:708:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:712:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalOntoUML.g:713:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalOntoUML.g:720:1: rule__Package__Group__2__Impl : ( ( rule__Package__AliasAssignment_2 )? ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:724:1: ( ( ( rule__Package__AliasAssignment_2 )? ) )
            // InternalOntoUML.g:725:1: ( ( rule__Package__AliasAssignment_2 )? )
            {
            // InternalOntoUML.g:725:1: ( ( rule__Package__AliasAssignment_2 )? )
            // InternalOntoUML.g:726:2: ( rule__Package__AliasAssignment_2 )?
            {
             before(grammarAccess.getPackageAccess().getAliasAssignment_2()); 
            // InternalOntoUML.g:727:2: ( rule__Package__AliasAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntoUML.g:727:3: rule__Package__AliasAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Package__AliasAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getAliasAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalOntoUML.g:735:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:739:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalOntoUML.g:740:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalOntoUML.g:747:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:751:1: ( ( '{' ) )
            // InternalOntoUML.g:752:1: ( '{' )
            {
            // InternalOntoUML.g:752:1: ( '{' )
            // InternalOntoUML.g:753:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalOntoUML.g:762:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:766:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalOntoUML.g:767:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalOntoUML.g:774:1: rule__Package__Group__4__Impl : ( ( rule__Package__ContentsAssignment_4 ) ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:778:1: ( ( ( rule__Package__ContentsAssignment_4 ) ) )
            // InternalOntoUML.g:779:1: ( ( rule__Package__ContentsAssignment_4 ) )
            {
            // InternalOntoUML.g:779:1: ( ( rule__Package__ContentsAssignment_4 ) )
            // InternalOntoUML.g:780:2: ( rule__Package__ContentsAssignment_4 )
            {
             before(grammarAccess.getPackageAccess().getContentsAssignment_4()); 
            // InternalOntoUML.g:781:2: ( rule__Package__ContentsAssignment_4 )
            // InternalOntoUML.g:781:3: rule__Package__ContentsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Package__ContentsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getContentsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // InternalOntoUML.g:789:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:793:1: ( rule__Package__Group__5__Impl )
            // InternalOntoUML.g:794:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // InternalOntoUML.g:800:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:804:1: ( ( '}' ) )
            // InternalOntoUML.g:805:1: ( '}' )
            {
            // InternalOntoUML.g:805:1: ( '}' )
            // InternalOntoUML.g:806:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group__0"
    // InternalOntoUML.g:816:1: rule__OntoUMLClass__Group__0 : rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1 ;
    public final void rule__OntoUMLClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:820:1: ( rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1 )
            // InternalOntoUML.g:821:2: rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__OntoUMLClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__0"


    // $ANTLR start "rule__OntoUMLClass__Group__0__Impl"
    // InternalOntoUML.g:828:1: rule__OntoUMLClass__Group__0__Impl : ( ( rule__OntoUMLClass___typeAssignment_0 ) ) ;
    public final void rule__OntoUMLClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:832:1: ( ( ( rule__OntoUMLClass___typeAssignment_0 ) ) )
            // InternalOntoUML.g:833:1: ( ( rule__OntoUMLClass___typeAssignment_0 ) )
            {
            // InternalOntoUML.g:833:1: ( ( rule__OntoUMLClass___typeAssignment_0 ) )
            // InternalOntoUML.g:834:2: ( rule__OntoUMLClass___typeAssignment_0 )
            {
             before(grammarAccess.getOntoUMLClassAccess().get_typeAssignment_0()); 
            // InternalOntoUML.g:835:2: ( rule__OntoUMLClass___typeAssignment_0 )
            // InternalOntoUML.g:835:3: rule__OntoUMLClass___typeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass___typeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().get_typeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__0__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group__1"
    // InternalOntoUML.g:843:1: rule__OntoUMLClass__Group__1 : rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2 ;
    public final void rule__OntoUMLClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:847:1: ( rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2 )
            // InternalOntoUML.g:848:2: rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__OntoUMLClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__1"


    // $ANTLR start "rule__OntoUMLClass__Group__1__Impl"
    // InternalOntoUML.g:855:1: rule__OntoUMLClass__Group__1__Impl : ( 'Class' ) ;
    public final void rule__OntoUMLClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:859:1: ( ( 'Class' ) )
            // InternalOntoUML.g:860:1: ( 'Class' )
            {
            // InternalOntoUML.g:860:1: ( 'Class' )
            // InternalOntoUML.g:861:2: 'Class'
            {
             before(grammarAccess.getOntoUMLClassAccess().getClassKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__1__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group__2"
    // InternalOntoUML.g:870:1: rule__OntoUMLClass__Group__2 : rule__OntoUMLClass__Group__2__Impl rule__OntoUMLClass__Group__3 ;
    public final void rule__OntoUMLClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:874:1: ( rule__OntoUMLClass__Group__2__Impl rule__OntoUMLClass__Group__3 )
            // InternalOntoUML.g:875:2: rule__OntoUMLClass__Group__2__Impl rule__OntoUMLClass__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__OntoUMLClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__2"


    // $ANTLR start "rule__OntoUMLClass__Group__2__Impl"
    // InternalOntoUML.g:882:1: rule__OntoUMLClass__Group__2__Impl : ( ( rule__OntoUMLClass__NameAssignment_2 ) ) ;
    public final void rule__OntoUMLClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:886:1: ( ( ( rule__OntoUMLClass__NameAssignment_2 ) ) )
            // InternalOntoUML.g:887:1: ( ( rule__OntoUMLClass__NameAssignment_2 ) )
            {
            // InternalOntoUML.g:887:1: ( ( rule__OntoUMLClass__NameAssignment_2 ) )
            // InternalOntoUML.g:888:2: ( rule__OntoUMLClass__NameAssignment_2 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getNameAssignment_2()); 
            // InternalOntoUML.g:889:2: ( rule__OntoUMLClass__NameAssignment_2 )
            // InternalOntoUML.g:889:3: rule__OntoUMLClass__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__2__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group__3"
    // InternalOntoUML.g:897:1: rule__OntoUMLClass__Group__3 : rule__OntoUMLClass__Group__3__Impl ;
    public final void rule__OntoUMLClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:901:1: ( rule__OntoUMLClass__Group__3__Impl )
            // InternalOntoUML.g:902:2: rule__OntoUMLClass__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__3"


    // $ANTLR start "rule__OntoUMLClass__Group__3__Impl"
    // InternalOntoUML.g:908:1: rule__OntoUMLClass__Group__3__Impl : ( ( rule__OntoUMLClass__AliasAssignment_3 )? ) ;
    public final void rule__OntoUMLClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:912:1: ( ( ( rule__OntoUMLClass__AliasAssignment_3 )? ) )
            // InternalOntoUML.g:913:1: ( ( rule__OntoUMLClass__AliasAssignment_3 )? )
            {
            // InternalOntoUML.g:913:1: ( ( rule__OntoUMLClass__AliasAssignment_3 )? )
            // InternalOntoUML.g:914:2: ( rule__OntoUMLClass__AliasAssignment_3 )?
            {
             before(grammarAccess.getOntoUMLClassAccess().getAliasAssignment_3()); 
            // InternalOntoUML.g:915:2: ( rule__OntoUMLClass__AliasAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoUML.g:915:3: rule__OntoUMLClass__AliasAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoUMLClass__AliasAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntoUMLClassAccess().getAliasAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__Group__3__Impl"


    // $ANTLR start "rule__Generalization__Group__0"
    // InternalOntoUML.g:924:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:928:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalOntoUML.g:929:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Generalization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__0"


    // $ANTLR start "rule__Generalization__Group__0__Impl"
    // InternalOntoUML.g:936:1: rule__Generalization__Group__0__Impl : ( 'Generalization' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:940:1: ( ( 'Generalization' ) )
            // InternalOntoUML.g:941:1: ( 'Generalization' )
            {
            // InternalOntoUML.g:941:1: ( 'Generalization' )
            // InternalOntoUML.g:942:2: 'Generalization'
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralizationKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getGeneralizationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__0__Impl"


    // $ANTLR start "rule__Generalization__Group__1"
    // InternalOntoUML.g:951:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:955:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalOntoUML.g:956:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Generalization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__1"


    // $ANTLR start "rule__Generalization__Group__1__Impl"
    // InternalOntoUML.g:963:1: rule__Generalization__Group__1__Impl : ( ( rule__Generalization__NameAssignment_1 ) ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:967:1: ( ( ( rule__Generalization__NameAssignment_1 ) ) )
            // InternalOntoUML.g:968:1: ( ( rule__Generalization__NameAssignment_1 ) )
            {
            // InternalOntoUML.g:968:1: ( ( rule__Generalization__NameAssignment_1 ) )
            // InternalOntoUML.g:969:2: ( rule__Generalization__NameAssignment_1 )
            {
             before(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 
            // InternalOntoUML.g:970:2: ( rule__Generalization__NameAssignment_1 )
            // InternalOntoUML.g:970:3: rule__Generalization__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__1__Impl"


    // $ANTLR start "rule__Generalization__Group__2"
    // InternalOntoUML.g:978:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:982:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalOntoUML.g:983:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Generalization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__2"


    // $ANTLR start "rule__Generalization__Group__2__Impl"
    // InternalOntoUML.g:990:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__AliasAssignment_2 )? ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:994:1: ( ( ( rule__Generalization__AliasAssignment_2 )? ) )
            // InternalOntoUML.g:995:1: ( ( rule__Generalization__AliasAssignment_2 )? )
            {
            // InternalOntoUML.g:995:1: ( ( rule__Generalization__AliasAssignment_2 )? )
            // InternalOntoUML.g:996:2: ( rule__Generalization__AliasAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationAccess().getAliasAssignment_2()); 
            // InternalOntoUML.g:997:2: ( rule__Generalization__AliasAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoUML.g:997:3: rule__Generalization__AliasAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Generalization__AliasAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralizationAccess().getAliasAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__2__Impl"


    // $ANTLR start "rule__Generalization__Group__3"
    // InternalOntoUML.g:1005:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1009:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalOntoUML.g:1010:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Generalization__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__3"


    // $ANTLR start "rule__Generalization__Group__3__Impl"
    // InternalOntoUML.g:1017:1: rule__Generalization__Group__3__Impl : ( 'superclass' ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1021:1: ( ( 'superclass' ) )
            // InternalOntoUML.g:1022:1: ( 'superclass' )
            {
            // InternalOntoUML.g:1022:1: ( 'superclass' )
            // InternalOntoUML.g:1023:2: 'superclass'
            {
             before(grammarAccess.getGeneralizationAccess().getSuperclassKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getSuperclassKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__3__Impl"


    // $ANTLR start "rule__Generalization__Group__4"
    // InternalOntoUML.g:1032:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl rule__Generalization__Group__5 ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1036:1: ( rule__Generalization__Group__4__Impl rule__Generalization__Group__5 )
            // InternalOntoUML.g:1037:2: rule__Generalization__Group__4__Impl rule__Generalization__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Generalization__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__4"


    // $ANTLR start "rule__Generalization__Group__4__Impl"
    // InternalOntoUML.g:1044:1: rule__Generalization__Group__4__Impl : ( ( rule__Generalization__SuperclassAssignment_4 ) ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1048:1: ( ( ( rule__Generalization__SuperclassAssignment_4 ) ) )
            // InternalOntoUML.g:1049:1: ( ( rule__Generalization__SuperclassAssignment_4 ) )
            {
            // InternalOntoUML.g:1049:1: ( ( rule__Generalization__SuperclassAssignment_4 ) )
            // InternalOntoUML.g:1050:2: ( rule__Generalization__SuperclassAssignment_4 )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperclassAssignment_4()); 
            // InternalOntoUML.g:1051:2: ( rule__Generalization__SuperclassAssignment_4 )
            // InternalOntoUML.g:1051:3: rule__Generalization__SuperclassAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__SuperclassAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getSuperclassAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__4__Impl"


    // $ANTLR start "rule__Generalization__Group__5"
    // InternalOntoUML.g:1059:1: rule__Generalization__Group__5 : rule__Generalization__Group__5__Impl rule__Generalization__Group__6 ;
    public final void rule__Generalization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1063:1: ( rule__Generalization__Group__5__Impl rule__Generalization__Group__6 )
            // InternalOntoUML.g:1064:2: rule__Generalization__Group__5__Impl rule__Generalization__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Generalization__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generalization__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__5"


    // $ANTLR start "rule__Generalization__Group__5__Impl"
    // InternalOntoUML.g:1071:1: rule__Generalization__Group__5__Impl : ( 'subclass' ) ;
    public final void rule__Generalization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1075:1: ( ( 'subclass' ) )
            // InternalOntoUML.g:1076:1: ( 'subclass' )
            {
            // InternalOntoUML.g:1076:1: ( 'subclass' )
            // InternalOntoUML.g:1077:2: 'subclass'
            {
             before(grammarAccess.getGeneralizationAccess().getSubclassKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getSubclassKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__5__Impl"


    // $ANTLR start "rule__Generalization__Group__6"
    // InternalOntoUML.g:1086:1: rule__Generalization__Group__6 : rule__Generalization__Group__6__Impl ;
    public final void rule__Generalization__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1090:1: ( rule__Generalization__Group__6__Impl )
            // InternalOntoUML.g:1091:2: rule__Generalization__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__6"


    // $ANTLR start "rule__Generalization__Group__6__Impl"
    // InternalOntoUML.g:1097:1: rule__Generalization__Group__6__Impl : ( ( rule__Generalization__SubclassAssignment_6 ) ) ;
    public final void rule__Generalization__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1101:1: ( ( ( rule__Generalization__SubclassAssignment_6 ) ) )
            // InternalOntoUML.g:1102:1: ( ( rule__Generalization__SubclassAssignment_6 ) )
            {
            // InternalOntoUML.g:1102:1: ( ( rule__Generalization__SubclassAssignment_6 ) )
            // InternalOntoUML.g:1103:2: ( rule__Generalization__SubclassAssignment_6 )
            {
             before(grammarAccess.getGeneralizationAccess().getSubclassAssignment_6()); 
            // InternalOntoUML.g:1104:2: ( rule__Generalization__SubclassAssignment_6 )
            // InternalOntoUML.g:1104:3: rule__Generalization__SubclassAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Generalization__SubclassAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationAccess().getSubclassAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__Group__6__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__0"
    // InternalOntoUML.g:1113:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1117:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoUML.g:1118:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__GeneralizationSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__0"


    // $ANTLR start "rule__GeneralizationSet__Group__0__Impl"
    // InternalOntoUML.g:1125:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0 ) ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1129:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0 ) ) )
            // InternalOntoUML.g:1130:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0 ) )
            {
            // InternalOntoUML.g:1130:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0 ) )
            // InternalOntoUML.g:1131:2: ( rule__GeneralizationSet__IsDisjointAssignment_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0()); 
            // InternalOntoUML.g:1132:2: ( rule__GeneralizationSet__IsDisjointAssignment_0 )
            // InternalOntoUML.g:1132:3: rule__GeneralizationSet__IsDisjointAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__IsDisjointAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__1"
    // InternalOntoUML.g:1140:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1144:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoUML.g:1145:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__GeneralizationSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__1"


    // $ANTLR start "rule__GeneralizationSet__Group__1__Impl"
    // InternalOntoUML.g:1152:1: rule__GeneralizationSet__Group__1__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_1 ) ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1156:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1 ) ) )
            // InternalOntoUML.g:1157:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_1 ) )
            {
            // InternalOntoUML.g:1157:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_1 ) )
            // InternalOntoUML.g:1158:2: ( rule__GeneralizationSet__IsCompleteAssignment_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_1()); 
            // InternalOntoUML.g:1159:2: ( rule__GeneralizationSet__IsCompleteAssignment_1 )
            // InternalOntoUML.g:1159:3: rule__GeneralizationSet__IsCompleteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__IsCompleteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__1__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__2"
    // InternalOntoUML.g:1167:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1171:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoUML.g:1172:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__GeneralizationSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__2"


    // $ANTLR start "rule__GeneralizationSet__Group__2__Impl"
    // InternalOntoUML.g:1179:1: rule__GeneralizationSet__Group__2__Impl : ( 'GeneralizationSet' ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1183:1: ( ( 'GeneralizationSet' ) )
            // InternalOntoUML.g:1184:1: ( 'GeneralizationSet' )
            {
            // InternalOntoUML.g:1184:1: ( 'GeneralizationSet' )
            // InternalOntoUML.g:1185:2: 'GeneralizationSet'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationSetKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationSetKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__2__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__3"
    // InternalOntoUML.g:1194:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1198:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalOntoUML.g:1199:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__GeneralizationSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__3"


    // $ANTLR start "rule__GeneralizationSet__Group__3__Impl"
    // InternalOntoUML.g:1206:1: rule__GeneralizationSet__Group__3__Impl : ( ( rule__GeneralizationSet__NameAssignment_3 ) ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1210:1: ( ( ( rule__GeneralizationSet__NameAssignment_3 ) ) )
            // InternalOntoUML.g:1211:1: ( ( rule__GeneralizationSet__NameAssignment_3 ) )
            {
            // InternalOntoUML.g:1211:1: ( ( rule__GeneralizationSet__NameAssignment_3 ) )
            // InternalOntoUML.g:1212:2: ( rule__GeneralizationSet__NameAssignment_3 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_3()); 
            // InternalOntoUML.g:1213:2: ( rule__GeneralizationSet__NameAssignment_3 )
            // InternalOntoUML.g:1213:3: rule__GeneralizationSet__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__3__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__4"
    // InternalOntoUML.g:1221:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1225:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalOntoUML.g:1226:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__GeneralizationSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__4"


    // $ANTLR start "rule__GeneralizationSet__Group__4__Impl"
    // InternalOntoUML.g:1233:1: rule__GeneralizationSet__Group__4__Impl : ( ( rule__GeneralizationSet__AliasAssignment_4 )? ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1237:1: ( ( ( rule__GeneralizationSet__AliasAssignment_4 )? ) )
            // InternalOntoUML.g:1238:1: ( ( rule__GeneralizationSet__AliasAssignment_4 )? )
            {
            // InternalOntoUML.g:1238:1: ( ( rule__GeneralizationSet__AliasAssignment_4 )? )
            // InternalOntoUML.g:1239:2: ( rule__GeneralizationSet__AliasAssignment_4 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getAliasAssignment_4()); 
            // InternalOntoUML.g:1240:2: ( rule__GeneralizationSet__AliasAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntoUML.g:1240:3: rule__GeneralizationSet__AliasAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__GeneralizationSet__AliasAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeneralizationSetAccess().getAliasAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__4__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__5"
    // InternalOntoUML.g:1248:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1252:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalOntoUML.g:1253:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__GeneralizationSet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__5"


    // $ANTLR start "rule__GeneralizationSet__Group__5__Impl"
    // InternalOntoUML.g:1260:1: rule__GeneralizationSet__Group__5__Impl : ( 'generalizations' ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1264:1: ( ( 'generalizations' ) )
            // InternalOntoUML.g:1265:1: ( 'generalizations' )
            {
            // InternalOntoUML.g:1265:1: ( 'generalizations' )
            // InternalOntoUML.g:1266:2: 'generalizations'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__5__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__6"
    // InternalOntoUML.g:1275:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1279:1: ( rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 )
            // InternalOntoUML.g:1280:2: rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__GeneralizationSet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__6"


    // $ANTLR start "rule__GeneralizationSet__Group__6__Impl"
    // InternalOntoUML.g:1287:1: rule__GeneralizationSet__Group__6__Impl : ( ( rule__GeneralizationSet__GeneralizationsAssignment_6 ) ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1291:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_6 ) ) )
            // InternalOntoUML.g:1292:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_6 ) )
            {
            // InternalOntoUML.g:1292:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_6 ) )
            // InternalOntoUML.g:1293:2: ( rule__GeneralizationSet__GeneralizationsAssignment_6 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_6()); 
            // InternalOntoUML.g:1294:2: ( rule__GeneralizationSet__GeneralizationsAssignment_6 )
            // InternalOntoUML.g:1294:3: rule__GeneralizationSet__GeneralizationsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__GeneralizationsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__6__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__7"
    // InternalOntoUML.g:1302:1: rule__GeneralizationSet__Group__7 : rule__GeneralizationSet__Group__7__Impl ;
    public final void rule__GeneralizationSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1306:1: ( rule__GeneralizationSet__Group__7__Impl )
            // InternalOntoUML.g:1307:2: rule__GeneralizationSet__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__7"


    // $ANTLR start "rule__GeneralizationSet__Group__7__Impl"
    // InternalOntoUML.g:1313:1: rule__GeneralizationSet__Group__7__Impl : ( ( rule__GeneralizationSet__Group_7__0 )* ) ;
    public final void rule__GeneralizationSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1317:1: ( ( ( rule__GeneralizationSet__Group_7__0 )* ) )
            // InternalOntoUML.g:1318:1: ( ( rule__GeneralizationSet__Group_7__0 )* )
            {
            // InternalOntoUML.g:1318:1: ( ( rule__GeneralizationSet__Group_7__0 )* )
            // InternalOntoUML.g:1319:2: ( rule__GeneralizationSet__Group_7__0 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_7()); 
            // InternalOntoUML.g:1320:2: ( rule__GeneralizationSet__Group_7__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==RULE_ID) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalOntoUML.g:1320:3: rule__GeneralizationSet__Group_7__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GeneralizationSet__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGeneralizationSetAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group__7__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_7__0"
    // InternalOntoUML.g:1329:1: rule__GeneralizationSet__Group_7__0 : rule__GeneralizationSet__Group_7__0__Impl rule__GeneralizationSet__Group_7__1 ;
    public final void rule__GeneralizationSet__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1333:1: ( rule__GeneralizationSet__Group_7__0__Impl rule__GeneralizationSet__Group_7__1 )
            // InternalOntoUML.g:1334:2: rule__GeneralizationSet__Group_7__0__Impl rule__GeneralizationSet__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__GeneralizationSet__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_7__0"


    // $ANTLR start "rule__GeneralizationSet__Group_7__0__Impl"
    // InternalOntoUML.g:1341:1: rule__GeneralizationSet__Group_7__0__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1345:1: ( ( ',' ) )
            // InternalOntoUML.g:1346:1: ( ',' )
            {
            // InternalOntoUML.g:1346:1: ( ',' )
            // InternalOntoUML.g:1347:2: ','
            {
             before(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_7__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_7__1"
    // InternalOntoUML.g:1356:1: rule__GeneralizationSet__Group_7__1 : rule__GeneralizationSet__Group_7__1__Impl ;
    public final void rule__GeneralizationSet__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1360:1: ( rule__GeneralizationSet__Group_7__1__Impl )
            // InternalOntoUML.g:1361:2: rule__GeneralizationSet__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_7__1"


    // $ANTLR start "rule__GeneralizationSet__Group_7__1__Impl"
    // InternalOntoUML.g:1367:1: rule__GeneralizationSet__Group_7__1__Impl : ( ( rule__GeneralizationSet__GeneralizationsAssignment_7_1 ) ) ;
    public final void rule__GeneralizationSet__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1371:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_7_1 ) ) )
            // InternalOntoUML.g:1372:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_7_1 ) )
            {
            // InternalOntoUML.g:1372:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_7_1 ) )
            // InternalOntoUML.g:1373:2: ( rule__GeneralizationSet__GeneralizationsAssignment_7_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_7_1()); 
            // InternalOntoUML.g:1374:2: ( rule__GeneralizationSet__GeneralizationsAssignment_7_1 )
            // InternalOntoUML.g:1374:3: rule__GeneralizationSet__GeneralizationsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__GeneralizationsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__Group_7__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_2"
    // InternalOntoUML.g:1383:1: rule__Model__ElementsAssignment_2 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1387:1: ( ( ruleModelElement ) )
            // InternalOntoUML.g:1388:2: ( ruleModelElement )
            {
            // InternalOntoUML.g:1388:2: ( ruleModelElement )
            // InternalOntoUML.g:1389:3: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_2"


    // $ANTLR start "rule__Model__ElementsAssignment_3_1"
    // InternalOntoUML.g:1398:1: rule__Model__ElementsAssignment_3_1 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1402:1: ( ( ruleModelElement ) )
            // InternalOntoUML.g:1403:2: ( ruleModelElement )
            {
            // InternalOntoUML.g:1403:2: ( ruleModelElement )
            // InternalOntoUML.g:1404:3: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_3_1"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // InternalOntoUML.g:1413:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1417:1: ( ( RULE_ID ) )
            // InternalOntoUML.g:1418:2: ( RULE_ID )
            {
            // InternalOntoUML.g:1418:2: ( RULE_ID )
            // InternalOntoUML.g:1419:3: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__AliasAssignment_2"
    // InternalOntoUML.g:1428:1: rule__Package__AliasAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Package__AliasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1432:1: ( ( RULE_STRING ) )
            // InternalOntoUML.g:1433:2: ( RULE_STRING )
            {
            // InternalOntoUML.g:1433:2: ( RULE_STRING )
            // InternalOntoUML.g:1434:3: RULE_STRING
            {
             before(grammarAccess.getPackageAccess().getAliasSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getAliasSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__AliasAssignment_2"


    // $ANTLR start "rule__Package__ContentsAssignment_4"
    // InternalOntoUML.g:1443:1: rule__Package__ContentsAssignment_4 : ( ruleModelElement ) ;
    public final void rule__Package__ContentsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1447:1: ( ( ruleModelElement ) )
            // InternalOntoUML.g:1448:2: ( ruleModelElement )
            {
            // InternalOntoUML.g:1448:2: ( ruleModelElement )
            // InternalOntoUML.g:1449:3: ruleModelElement
            {
             before(grammarAccess.getPackageAccess().getContentsModelElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getContentsModelElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ContentsAssignment_4"


    // $ANTLR start "rule__OntoUMLClass___typeAssignment_0"
    // InternalOntoUML.g:1458:1: rule__OntoUMLClass___typeAssignment_0 : ( ruleEndurantType ) ;
    public final void rule__OntoUMLClass___typeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1462:1: ( ( ruleEndurantType ) )
            // InternalOntoUML.g:1463:2: ( ruleEndurantType )
            {
            // InternalOntoUML.g:1463:2: ( ruleEndurantType )
            // InternalOntoUML.g:1464:3: ruleEndurantType
            {
             before(grammarAccess.getOntoUMLClassAccess().get_typeEndurantTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEndurantType();

            state._fsp--;

             after(grammarAccess.getOntoUMLClassAccess().get_typeEndurantTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass___typeAssignment_0"


    // $ANTLR start "rule__OntoUMLClass__NameAssignment_2"
    // InternalOntoUML.g:1473:1: rule__OntoUMLClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OntoUMLClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1477:1: ( ( RULE_ID ) )
            // InternalOntoUML.g:1478:2: ( RULE_ID )
            {
            // InternalOntoUML.g:1478:2: ( RULE_ID )
            // InternalOntoUML.g:1479:3: RULE_ID
            {
             before(grammarAccess.getOntoUMLClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__NameAssignment_2"


    // $ANTLR start "rule__OntoUMLClass__AliasAssignment_3"
    // InternalOntoUML.g:1488:1: rule__OntoUMLClass__AliasAssignment_3 : ( RULE_STRING ) ;
    public final void rule__OntoUMLClass__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1492:1: ( ( RULE_STRING ) )
            // InternalOntoUML.g:1493:2: ( RULE_STRING )
            {
            // InternalOntoUML.g:1493:2: ( RULE_STRING )
            // InternalOntoUML.g:1494:3: RULE_STRING
            {
             before(grammarAccess.getOntoUMLClassAccess().getAliasSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getAliasSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OntoUMLClass__AliasAssignment_3"


    // $ANTLR start "rule__Generalization__NameAssignment_1"
    // InternalOntoUML.g:1503:1: rule__Generalization__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Generalization__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1507:1: ( ( RULE_ID ) )
            // InternalOntoUML.g:1508:2: ( RULE_ID )
            {
            // InternalOntoUML.g:1508:2: ( RULE_ID )
            // InternalOntoUML.g:1509:3: RULE_ID
            {
             before(grammarAccess.getGeneralizationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__NameAssignment_1"


    // $ANTLR start "rule__Generalization__AliasAssignment_2"
    // InternalOntoUML.g:1518:1: rule__Generalization__AliasAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Generalization__AliasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1522:1: ( ( RULE_STRING ) )
            // InternalOntoUML.g:1523:2: ( RULE_STRING )
            {
            // InternalOntoUML.g:1523:2: ( RULE_STRING )
            // InternalOntoUML.g:1524:3: RULE_STRING
            {
             before(grammarAccess.getGeneralizationAccess().getAliasSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getAliasSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__AliasAssignment_2"


    // $ANTLR start "rule__Generalization__SuperclassAssignment_4"
    // InternalOntoUML.g:1533:1: rule__Generalization__SuperclassAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Generalization__SuperclassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1537:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoUML.g:1538:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoUML.g:1538:2: ( ( ruleQualifiedName ) )
            // InternalOntoUML.g:1539:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperclassOntoUMLClassCrossReference_4_0()); 
            // InternalOntoUML.g:1540:3: ( ruleQualifiedName )
            // InternalOntoUML.g:1541:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationAccess().getSuperclassOntoUMLClassQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getSuperclassOntoUMLClassQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getGeneralizationAccess().getSuperclassOntoUMLClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__SuperclassAssignment_4"


    // $ANTLR start "rule__Generalization__SubclassAssignment_6"
    // InternalOntoUML.g:1552:1: rule__Generalization__SubclassAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Generalization__SubclassAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1556:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoUML.g:1557:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoUML.g:1557:2: ( ( ruleQualifiedName ) )
            // InternalOntoUML.g:1558:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationAccess().getSubclassOntoUMLClassCrossReference_6_0()); 
            // InternalOntoUML.g:1559:3: ( ruleQualifiedName )
            // InternalOntoUML.g:1560:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationAccess().getSubclassOntoUMLClassQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationAccess().getSubclassOntoUMLClassQualifiedNameParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getGeneralizationAccess().getSubclassOntoUMLClassCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generalization__SubclassAssignment_6"


    // $ANTLR start "rule__GeneralizationSet__IsDisjointAssignment_0"
    // InternalOntoUML.g:1571:1: rule__GeneralizationSet__IsDisjointAssignment_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1575:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoUML.g:1576:2: ( ( 'disjoint' ) )
            {
            // InternalOntoUML.g:1576:2: ( ( 'disjoint' ) )
            // InternalOntoUML.g:1577:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0()); 
            // InternalOntoUML.g:1578:3: ( 'disjoint' )
            // InternalOntoUML.g:1579:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsDisjointAssignment_0"


    // $ANTLR start "rule__GeneralizationSet__IsCompleteAssignment_1"
    // InternalOntoUML.g:1590:1: rule__GeneralizationSet__IsCompleteAssignment_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1594:1: ( ( ( 'complete' ) ) )
            // InternalOntoUML.g:1595:2: ( ( 'complete' ) )
            {
            // InternalOntoUML.g:1595:2: ( ( 'complete' ) )
            // InternalOntoUML.g:1596:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_0()); 
            // InternalOntoUML.g:1597:3: ( 'complete' )
            // InternalOntoUML.g:1598:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_0()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__IsCompleteAssignment_1"


    // $ANTLR start "rule__GeneralizationSet__NameAssignment_3"
    // InternalOntoUML.g:1609:1: rule__GeneralizationSet__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__GeneralizationSet__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1613:1: ( ( RULE_ID ) )
            // InternalOntoUML.g:1614:2: ( RULE_ID )
            {
            // InternalOntoUML.g:1614:2: ( RULE_ID )
            // InternalOntoUML.g:1615:3: RULE_ID
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__NameAssignment_3"


    // $ANTLR start "rule__GeneralizationSet__AliasAssignment_4"
    // InternalOntoUML.g:1624:1: rule__GeneralizationSet__AliasAssignment_4 : ( RULE_STRING ) ;
    public final void rule__GeneralizationSet__AliasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1628:1: ( ( RULE_STRING ) )
            // InternalOntoUML.g:1629:2: ( RULE_STRING )
            {
            // InternalOntoUML.g:1629:2: ( RULE_STRING )
            // InternalOntoUML.g:1630:3: RULE_STRING
            {
             before(grammarAccess.getGeneralizationSetAccess().getAliasSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getAliasSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__AliasAssignment_4"


    // $ANTLR start "rule__GeneralizationSet__GeneralizationsAssignment_6"
    // InternalOntoUML.g:1639:1: rule__GeneralizationSet__GeneralizationsAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1643:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoUML.g:1644:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoUML.g:1644:2: ( ( ruleQualifiedName ) )
            // InternalOntoUML.g:1645:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_6_0()); 
            // InternalOntoUML.g:1646:3: ( ruleQualifiedName )
            // InternalOntoUML.g:1647:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationQualifiedNameParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__GeneralizationsAssignment_6"


    // $ANTLR start "rule__GeneralizationSet__GeneralizationsAssignment_7_1"
    // InternalOntoUML.g:1658:1: rule__GeneralizationSet__GeneralizationsAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1662:1: ( ( ( ruleQualifiedName ) ) )
            // InternalOntoUML.g:1663:2: ( ( ruleQualifiedName ) )
            {
            // InternalOntoUML.g:1663:2: ( ( ruleQualifiedName ) )
            // InternalOntoUML.g:1664:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_7_1_0()); 
            // InternalOntoUML.g:1665:3: ( ruleQualifiedName )
            // InternalOntoUML.g:1666:4: ruleQualifiedName
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationQualifiedNameParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationQualifiedNameParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneralizationSet__GeneralizationsAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000008507FF800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});

}