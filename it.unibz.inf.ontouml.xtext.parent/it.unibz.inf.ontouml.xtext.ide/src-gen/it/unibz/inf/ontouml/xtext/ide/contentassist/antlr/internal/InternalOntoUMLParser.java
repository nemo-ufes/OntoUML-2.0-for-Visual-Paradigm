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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'none'", "'kind'", "'relatorKind'", "'modeKind'", "'qualityKind'", "'subkind'", "'role'", "'phase'", "'category'", "'mixin'", "'roleMixin'", "'phaseMixin'", "'Model'", "'{'", "'}'", "','", "'Class'", "'supers...'", "'subs...'", "'Generalization'", "'superclass'", "'subclass'", "'GeneralizationSet'", "'generalizations'", "'disjoint'", "'complete'"
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


    // $ANTLR start "entryRuleModelElement"
    // InternalOntoUML.g:78:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // InternalOntoUML.g:79:1: ( ruleModelElement EOF )
            // InternalOntoUML.g:80:1: ruleModelElement EOF
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
    // InternalOntoUML.g:87:1: ruleModelElement : ( ( rule__ModelElement__Alternatives ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:91:2: ( ( ( rule__ModelElement__Alternatives ) ) )
            // InternalOntoUML.g:92:2: ( ( rule__ModelElement__Alternatives ) )
            {
            // InternalOntoUML.g:92:2: ( ( rule__ModelElement__Alternatives ) )
            // InternalOntoUML.g:93:3: ( rule__ModelElement__Alternatives )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives()); 
            // InternalOntoUML.g:94:3: ( rule__ModelElement__Alternatives )
            // InternalOntoUML.g:94:4: rule__ModelElement__Alternatives
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


    // $ANTLR start "entryRuleOntoUMLClass"
    // InternalOntoUML.g:103:1: entryRuleOntoUMLClass : ruleOntoUMLClass EOF ;
    public final void entryRuleOntoUMLClass() throws RecognitionException {
        try {
            // InternalOntoUML.g:104:1: ( ruleOntoUMLClass EOF )
            // InternalOntoUML.g:105:1: ruleOntoUMLClass EOF
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
    // InternalOntoUML.g:112:1: ruleOntoUMLClass : ( ( rule__OntoUMLClass__Group__0 ) ) ;
    public final void ruleOntoUMLClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:116:2: ( ( ( rule__OntoUMLClass__Group__0 ) ) )
            // InternalOntoUML.g:117:2: ( ( rule__OntoUMLClass__Group__0 ) )
            {
            // InternalOntoUML.g:117:2: ( ( rule__OntoUMLClass__Group__0 ) )
            // InternalOntoUML.g:118:3: ( rule__OntoUMLClass__Group__0 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup()); 
            // InternalOntoUML.g:119:3: ( rule__OntoUMLClass__Group__0 )
            // InternalOntoUML.g:119:4: rule__OntoUMLClass__Group__0
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
    // InternalOntoUML.g:128:1: entryRuleGeneralization : ruleGeneralization EOF ;
    public final void entryRuleGeneralization() throws RecognitionException {
        try {
            // InternalOntoUML.g:129:1: ( ruleGeneralization EOF )
            // InternalOntoUML.g:130:1: ruleGeneralization EOF
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
    // InternalOntoUML.g:137:1: ruleGeneralization : ( ( rule__Generalization__Group__0 ) ) ;
    public final void ruleGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:141:2: ( ( ( rule__Generalization__Group__0 ) ) )
            // InternalOntoUML.g:142:2: ( ( rule__Generalization__Group__0 ) )
            {
            // InternalOntoUML.g:142:2: ( ( rule__Generalization__Group__0 ) )
            // InternalOntoUML.g:143:3: ( rule__Generalization__Group__0 )
            {
             before(grammarAccess.getGeneralizationAccess().getGroup()); 
            // InternalOntoUML.g:144:3: ( rule__Generalization__Group__0 )
            // InternalOntoUML.g:144:4: rule__Generalization__Group__0
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
    // InternalOntoUML.g:153:1: entryRuleGeneralizationSet : ruleGeneralizationSet EOF ;
    public final void entryRuleGeneralizationSet() throws RecognitionException {
        try {
            // InternalOntoUML.g:154:1: ( ruleGeneralizationSet EOF )
            // InternalOntoUML.g:155:1: ruleGeneralizationSet EOF
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
    // InternalOntoUML.g:162:1: ruleGeneralizationSet : ( ( rule__GeneralizationSet__Group__0 ) ) ;
    public final void ruleGeneralizationSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:166:2: ( ( ( rule__GeneralizationSet__Group__0 ) ) )
            // InternalOntoUML.g:167:2: ( ( rule__GeneralizationSet__Group__0 ) )
            {
            // InternalOntoUML.g:167:2: ( ( rule__GeneralizationSet__Group__0 ) )
            // InternalOntoUML.g:168:3: ( rule__GeneralizationSet__Group__0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup()); 
            // InternalOntoUML.g:169:3: ( rule__GeneralizationSet__Group__0 )
            // InternalOntoUML.g:169:4: rule__GeneralizationSet__Group__0
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
    // InternalOntoUML.g:178:1: ruleEndurantType : ( ( rule__EndurantType__Alternatives ) ) ;
    public final void ruleEndurantType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:182:1: ( ( ( rule__EndurantType__Alternatives ) ) )
            // InternalOntoUML.g:183:2: ( ( rule__EndurantType__Alternatives ) )
            {
            // InternalOntoUML.g:183:2: ( ( rule__EndurantType__Alternatives ) )
            // InternalOntoUML.g:184:3: ( rule__EndurantType__Alternatives )
            {
             before(grammarAccess.getEndurantTypeAccess().getAlternatives()); 
            // InternalOntoUML.g:185:3: ( rule__EndurantType__Alternatives )
            // InternalOntoUML.g:185:4: rule__EndurantType__Alternatives
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
    // InternalOntoUML.g:193:1: rule__ModelElement__Alternatives : ( ( ruleOntoUMLClass ) | ( ruleGeneralization ) | ( ruleGeneralizationSet ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:197:1: ( ( ruleOntoUMLClass ) | ( ruleGeneralization ) | ( ruleGeneralizationSet ) )
            int alt1=3;
            switch ( input.LA(1) ) {
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
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 35:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalOntoUML.g:198:2: ( ruleOntoUMLClass )
                    {
                    // InternalOntoUML.g:198:2: ( ruleOntoUMLClass )
                    // InternalOntoUML.g:199:3: ruleOntoUMLClass
                    {
                     before(grammarAccess.getModelElementAccess().getOntoUMLClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOntoUMLClass();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getOntoUMLClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:204:2: ( ruleGeneralization )
                    {
                    // InternalOntoUML.g:204:2: ( ruleGeneralization )
                    // InternalOntoUML.g:205:3: ruleGeneralization
                    {
                     before(grammarAccess.getModelElementAccess().getGeneralizationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralization();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getGeneralizationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:210:2: ( ruleGeneralizationSet )
                    {
                    // InternalOntoUML.g:210:2: ( ruleGeneralizationSet )
                    // InternalOntoUML.g:211:3: ruleGeneralizationSet
                    {
                     before(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneralizationSet();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_2()); 

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
    // InternalOntoUML.g:220:1: rule__EndurantType__Alternatives : ( ( ( 'none' ) ) | ( ( 'kind' ) ) | ( ( 'relatorKind' ) ) | ( ( 'modeKind' ) ) | ( ( 'qualityKind' ) ) | ( ( 'subkind' ) ) | ( ( 'role' ) ) | ( ( 'phase' ) ) | ( ( 'category' ) ) | ( ( 'mixin' ) ) | ( ( 'roleMixin' ) ) | ( ( 'phaseMixin' ) ) );
    public final void rule__EndurantType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:224:1: ( ( ( 'none' ) ) | ( ( 'kind' ) ) | ( ( 'relatorKind' ) ) | ( ( 'modeKind' ) ) | ( ( 'qualityKind' ) ) | ( ( 'subkind' ) ) | ( ( 'role' ) ) | ( ( 'phase' ) ) | ( ( 'category' ) ) | ( ( 'mixin' ) ) | ( ( 'roleMixin' ) ) | ( ( 'phaseMixin' ) ) )
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
                    // InternalOntoUML.g:225:2: ( ( 'none' ) )
                    {
                    // InternalOntoUML.g:225:2: ( ( 'none' ) )
                    // InternalOntoUML.g:226:3: ( 'none' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getNoneEnumLiteralDeclaration_0()); 
                    // InternalOntoUML.g:227:3: ( 'none' )
                    // InternalOntoUML.g:227:4: 'none'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getNoneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:231:2: ( ( 'kind' ) )
                    {
                    // InternalOntoUML.g:231:2: ( ( 'kind' ) )
                    // InternalOntoUML.g:232:3: ( 'kind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_1()); 
                    // InternalOntoUML.g:233:3: ( 'kind' )
                    // InternalOntoUML.g:233:4: 'kind'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:237:2: ( ( 'relatorKind' ) )
                    {
                    // InternalOntoUML.g:237:2: ( ( 'relatorKind' ) )
                    // InternalOntoUML.g:238:3: ( 'relatorKind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_2()); 
                    // InternalOntoUML.g:239:3: ( 'relatorKind' )
                    // InternalOntoUML.g:239:4: 'relatorKind'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:243:2: ( ( 'modeKind' ) )
                    {
                    // InternalOntoUML.g:243:2: ( ( 'modeKind' ) )
                    // InternalOntoUML.g:244:3: ( 'modeKind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_3()); 
                    // InternalOntoUML.g:245:3: ( 'modeKind' )
                    // InternalOntoUML.g:245:4: 'modeKind'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoUML.g:249:2: ( ( 'qualityKind' ) )
                    {
                    // InternalOntoUML.g:249:2: ( ( 'qualityKind' ) )
                    // InternalOntoUML.g:250:3: ( 'qualityKind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_4()); 
                    // InternalOntoUML.g:251:3: ( 'qualityKind' )
                    // InternalOntoUML.g:251:4: 'qualityKind'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoUML.g:255:2: ( ( 'subkind' ) )
                    {
                    // InternalOntoUML.g:255:2: ( ( 'subkind' ) )
                    // InternalOntoUML.g:256:3: ( 'subkind' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_5()); 
                    // InternalOntoUML.g:257:3: ( 'subkind' )
                    // InternalOntoUML.g:257:4: 'subkind'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOntoUML.g:261:2: ( ( 'role' ) )
                    {
                    // InternalOntoUML.g:261:2: ( ( 'role' ) )
                    // InternalOntoUML.g:262:3: ( 'role' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_6()); 
                    // InternalOntoUML.g:263:3: ( 'role' )
                    // InternalOntoUML.g:263:4: 'role'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOntoUML.g:267:2: ( ( 'phase' ) )
                    {
                    // InternalOntoUML.g:267:2: ( ( 'phase' ) )
                    // InternalOntoUML.g:268:3: ( 'phase' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_7()); 
                    // InternalOntoUML.g:269:3: ( 'phase' )
                    // InternalOntoUML.g:269:4: 'phase'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalOntoUML.g:273:2: ( ( 'category' ) )
                    {
                    // InternalOntoUML.g:273:2: ( ( 'category' ) )
                    // InternalOntoUML.g:274:3: ( 'category' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_8()); 
                    // InternalOntoUML.g:275:3: ( 'category' )
                    // InternalOntoUML.g:275:4: 'category'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalOntoUML.g:279:2: ( ( 'mixin' ) )
                    {
                    // InternalOntoUML.g:279:2: ( ( 'mixin' ) )
                    // InternalOntoUML.g:280:3: ( 'mixin' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_9()); 
                    // InternalOntoUML.g:281:3: ( 'mixin' )
                    // InternalOntoUML.g:281:4: 'mixin'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalOntoUML.g:285:2: ( ( 'roleMixin' ) )
                    {
                    // InternalOntoUML.g:285:2: ( ( 'roleMixin' ) )
                    // InternalOntoUML.g:286:3: ( 'roleMixin' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_10()); 
                    // InternalOntoUML.g:287:3: ( 'roleMixin' )
                    // InternalOntoUML.g:287:4: 'roleMixin'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalOntoUML.g:291:2: ( ( 'phaseMixin' ) )
                    {
                    // InternalOntoUML.g:291:2: ( ( 'phaseMixin' ) )
                    // InternalOntoUML.g:292:3: ( 'phaseMixin' )
                    {
                     before(grammarAccess.getEndurantTypeAccess().getPhaseMixinEnumLiteralDeclaration_11()); 
                    // InternalOntoUML.g:293:3: ( 'phaseMixin' )
                    // InternalOntoUML.g:293:4: 'phaseMixin'
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
    // InternalOntoUML.g:301:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:305:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOntoUML.g:306:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalOntoUML.g:313:1: rule__Model__Group__0__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:317:1: ( ( 'Model' ) )
            // InternalOntoUML.g:318:1: ( 'Model' )
            {
            // InternalOntoUML.g:318:1: ( 'Model' )
            // InternalOntoUML.g:319:2: 'Model'
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
    // InternalOntoUML.g:328:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:332:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOntoUML.g:333:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalOntoUML.g:340:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:344:1: ( ( '{' ) )
            // InternalOntoUML.g:345:1: ( '{' )
            {
            // InternalOntoUML.g:345:1: ( '{' )
            // InternalOntoUML.g:346:2: '{'
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
    // InternalOntoUML.g:355:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:359:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOntoUML.g:360:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalOntoUML.g:367:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementsAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:371:1: ( ( ( rule__Model__ElementsAssignment_2 ) ) )
            // InternalOntoUML.g:372:1: ( ( rule__Model__ElementsAssignment_2 ) )
            {
            // InternalOntoUML.g:372:1: ( ( rule__Model__ElementsAssignment_2 ) )
            // InternalOntoUML.g:373:2: ( rule__Model__ElementsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_2()); 
            // InternalOntoUML.g:374:2: ( rule__Model__ElementsAssignment_2 )
            // InternalOntoUML.g:374:3: rule__Model__ElementsAssignment_2
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
    // InternalOntoUML.g:382:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:386:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalOntoUML.g:387:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalOntoUML.g:394:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:398:1: ( ( ( rule__Model__Group_3__0 )* ) )
            // InternalOntoUML.g:399:1: ( ( rule__Model__Group_3__0 )* )
            {
            // InternalOntoUML.g:399:1: ( ( rule__Model__Group_3__0 )* )
            // InternalOntoUML.g:400:2: ( rule__Model__Group_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // InternalOntoUML.g:401:2: ( rule__Model__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOntoUML.g:401:3: rule__Model__Group_3__0
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
    // InternalOntoUML.g:409:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:413:1: ( rule__Model__Group__4__Impl )
            // InternalOntoUML.g:414:2: rule__Model__Group__4__Impl
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
    // InternalOntoUML.g:420:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:424:1: ( ( '}' ) )
            // InternalOntoUML.g:425:1: ( '}' )
            {
            // InternalOntoUML.g:425:1: ( '}' )
            // InternalOntoUML.g:426:2: '}'
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
    // InternalOntoUML.g:436:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:440:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // InternalOntoUML.g:441:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
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
    // InternalOntoUML.g:448:1: rule__Model__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:452:1: ( ( ',' ) )
            // InternalOntoUML.g:453:1: ( ',' )
            {
            // InternalOntoUML.g:453:1: ( ',' )
            // InternalOntoUML.g:454:2: ','
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
    // InternalOntoUML.g:463:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:467:1: ( rule__Model__Group_3__1__Impl )
            // InternalOntoUML.g:468:2: rule__Model__Group_3__1__Impl
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
    // InternalOntoUML.g:474:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__ElementsAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:478:1: ( ( ( rule__Model__ElementsAssignment_3_1 ) ) )
            // InternalOntoUML.g:479:1: ( ( rule__Model__ElementsAssignment_3_1 ) )
            {
            // InternalOntoUML.g:479:1: ( ( rule__Model__ElementsAssignment_3_1 ) )
            // InternalOntoUML.g:480:2: ( rule__Model__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 
            // InternalOntoUML.g:481:2: ( rule__Model__ElementsAssignment_3_1 )
            // InternalOntoUML.g:481:3: rule__Model__ElementsAssignment_3_1
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


    // $ANTLR start "rule__OntoUMLClass__Group__0"
    // InternalOntoUML.g:490:1: rule__OntoUMLClass__Group__0 : rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1 ;
    public final void rule__OntoUMLClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:494:1: ( rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1 )
            // InternalOntoUML.g:495:2: rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalOntoUML.g:502:1: rule__OntoUMLClass__Group__0__Impl : ( ( rule__OntoUMLClass___typeAssignment_0 ) ) ;
    public final void rule__OntoUMLClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:506:1: ( ( ( rule__OntoUMLClass___typeAssignment_0 ) ) )
            // InternalOntoUML.g:507:1: ( ( rule__OntoUMLClass___typeAssignment_0 ) )
            {
            // InternalOntoUML.g:507:1: ( ( rule__OntoUMLClass___typeAssignment_0 ) )
            // InternalOntoUML.g:508:2: ( rule__OntoUMLClass___typeAssignment_0 )
            {
             before(grammarAccess.getOntoUMLClassAccess().get_typeAssignment_0()); 
            // InternalOntoUML.g:509:2: ( rule__OntoUMLClass___typeAssignment_0 )
            // InternalOntoUML.g:509:3: rule__OntoUMLClass___typeAssignment_0
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
    // InternalOntoUML.g:517:1: rule__OntoUMLClass__Group__1 : rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2 ;
    public final void rule__OntoUMLClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:521:1: ( rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2 )
            // InternalOntoUML.g:522:2: rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUML.g:529:1: rule__OntoUMLClass__Group__1__Impl : ( 'Class' ) ;
    public final void rule__OntoUMLClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:533:1: ( ( 'Class' ) )
            // InternalOntoUML.g:534:1: ( 'Class' )
            {
            // InternalOntoUML.g:534:1: ( 'Class' )
            // InternalOntoUML.g:535:2: 'Class'
            {
             before(grammarAccess.getOntoUMLClassAccess().getClassKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoUML.g:544:1: rule__OntoUMLClass__Group__2 : rule__OntoUMLClass__Group__2__Impl rule__OntoUMLClass__Group__3 ;
    public final void rule__OntoUMLClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:548:1: ( rule__OntoUMLClass__Group__2__Impl rule__OntoUMLClass__Group__3 )
            // InternalOntoUML.g:549:2: rule__OntoUMLClass__Group__2__Impl rule__OntoUMLClass__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalOntoUML.g:556:1: rule__OntoUMLClass__Group__2__Impl : ( ( rule__OntoUMLClass__NameAssignment_2 ) ) ;
    public final void rule__OntoUMLClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:560:1: ( ( ( rule__OntoUMLClass__NameAssignment_2 ) ) )
            // InternalOntoUML.g:561:1: ( ( rule__OntoUMLClass__NameAssignment_2 ) )
            {
            // InternalOntoUML.g:561:1: ( ( rule__OntoUMLClass__NameAssignment_2 ) )
            // InternalOntoUML.g:562:2: ( rule__OntoUMLClass__NameAssignment_2 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getNameAssignment_2()); 
            // InternalOntoUML.g:563:2: ( rule__OntoUMLClass__NameAssignment_2 )
            // InternalOntoUML.g:563:3: rule__OntoUMLClass__NameAssignment_2
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
    // InternalOntoUML.g:571:1: rule__OntoUMLClass__Group__3 : rule__OntoUMLClass__Group__3__Impl rule__OntoUMLClass__Group__4 ;
    public final void rule__OntoUMLClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:575:1: ( rule__OntoUMLClass__Group__3__Impl rule__OntoUMLClass__Group__4 )
            // InternalOntoUML.g:576:2: rule__OntoUMLClass__Group__3__Impl rule__OntoUMLClass__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__OntoUMLClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group__4();

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
    // InternalOntoUML.g:583:1: rule__OntoUMLClass__Group__3__Impl : ( ( rule__OntoUMLClass__AliasAssignment_3 )? ) ;
    public final void rule__OntoUMLClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:587:1: ( ( ( rule__OntoUMLClass__AliasAssignment_3 )? ) )
            // InternalOntoUML.g:588:1: ( ( rule__OntoUMLClass__AliasAssignment_3 )? )
            {
            // InternalOntoUML.g:588:1: ( ( rule__OntoUMLClass__AliasAssignment_3 )? )
            // InternalOntoUML.g:589:2: ( rule__OntoUMLClass__AliasAssignment_3 )?
            {
             before(grammarAccess.getOntoUMLClassAccess().getAliasAssignment_3()); 
            // InternalOntoUML.g:590:2: ( rule__OntoUMLClass__AliasAssignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoUML.g:590:3: rule__OntoUMLClass__AliasAssignment_3
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


    // $ANTLR start "rule__OntoUMLClass__Group__4"
    // InternalOntoUML.g:598:1: rule__OntoUMLClass__Group__4 : rule__OntoUMLClass__Group__4__Impl rule__OntoUMLClass__Group__5 ;
    public final void rule__OntoUMLClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:602:1: ( rule__OntoUMLClass__Group__4__Impl rule__OntoUMLClass__Group__5 )
            // InternalOntoUML.g:603:2: rule__OntoUMLClass__Group__4__Impl rule__OntoUMLClass__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__OntoUMLClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group__5();

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
    // $ANTLR end "rule__OntoUMLClass__Group__4"


    // $ANTLR start "rule__OntoUMLClass__Group__4__Impl"
    // InternalOntoUML.g:610:1: rule__OntoUMLClass__Group__4__Impl : ( ( rule__OntoUMLClass__Group_4__0 )? ) ;
    public final void rule__OntoUMLClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:614:1: ( ( ( rule__OntoUMLClass__Group_4__0 )? ) )
            // InternalOntoUML.g:615:1: ( ( rule__OntoUMLClass__Group_4__0 )? )
            {
            // InternalOntoUML.g:615:1: ( ( rule__OntoUMLClass__Group_4__0 )? )
            // InternalOntoUML.g:616:2: ( rule__OntoUMLClass__Group_4__0 )?
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup_4()); 
            // InternalOntoUML.g:617:2: ( rule__OntoUMLClass__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntoUML.g:617:3: rule__OntoUMLClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoUMLClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntoUMLClassAccess().getGroup_4()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group__4__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group__5"
    // InternalOntoUML.g:625:1: rule__OntoUMLClass__Group__5 : rule__OntoUMLClass__Group__5__Impl ;
    public final void rule__OntoUMLClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:629:1: ( rule__OntoUMLClass__Group__5__Impl )
            // InternalOntoUML.g:630:2: rule__OntoUMLClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group__5__Impl();

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
    // $ANTLR end "rule__OntoUMLClass__Group__5"


    // $ANTLR start "rule__OntoUMLClass__Group__5__Impl"
    // InternalOntoUML.g:636:1: rule__OntoUMLClass__Group__5__Impl : ( ( rule__OntoUMLClass__Group_5__0 )? ) ;
    public final void rule__OntoUMLClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:640:1: ( ( ( rule__OntoUMLClass__Group_5__0 )? ) )
            // InternalOntoUML.g:641:1: ( ( rule__OntoUMLClass__Group_5__0 )? )
            {
            // InternalOntoUML.g:641:1: ( ( rule__OntoUMLClass__Group_5__0 )? )
            // InternalOntoUML.g:642:2: ( rule__OntoUMLClass__Group_5__0 )?
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup_5()); 
            // InternalOntoUML.g:643:2: ( rule__OntoUMLClass__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoUML.g:643:3: rule__OntoUMLClass__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoUMLClass__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOntoUMLClassAccess().getGroup_5()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group__5__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_4__0"
    // InternalOntoUML.g:652:1: rule__OntoUMLClass__Group_4__0 : rule__OntoUMLClass__Group_4__0__Impl rule__OntoUMLClass__Group_4__1 ;
    public final void rule__OntoUMLClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:656:1: ( rule__OntoUMLClass__Group_4__0__Impl rule__OntoUMLClass__Group_4__1 )
            // InternalOntoUML.g:657:2: rule__OntoUMLClass__Group_4__0__Impl rule__OntoUMLClass__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__OntoUMLClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_4__1();

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
    // $ANTLR end "rule__OntoUMLClass__Group_4__0"


    // $ANTLR start "rule__OntoUMLClass__Group_4__0__Impl"
    // InternalOntoUML.g:664:1: rule__OntoUMLClass__Group_4__0__Impl : ( 'supers...' ) ;
    public final void rule__OntoUMLClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:668:1: ( ( 'supers...' ) )
            // InternalOntoUML.g:669:1: ( 'supers...' )
            {
            // InternalOntoUML.g:669:1: ( 'supers...' )
            // InternalOntoUML.g:670:2: 'supers...'
            {
             before(grammarAccess.getOntoUMLClassAccess().getSupersKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getSupersKeyword_4_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_4__0__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_4__1"
    // InternalOntoUML.g:679:1: rule__OntoUMLClass__Group_4__1 : rule__OntoUMLClass__Group_4__1__Impl rule__OntoUMLClass__Group_4__2 ;
    public final void rule__OntoUMLClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:683:1: ( rule__OntoUMLClass__Group_4__1__Impl rule__OntoUMLClass__Group_4__2 )
            // InternalOntoUML.g:684:2: rule__OntoUMLClass__Group_4__1__Impl rule__OntoUMLClass__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__OntoUMLClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_4__2();

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
    // $ANTLR end "rule__OntoUMLClass__Group_4__1"


    // $ANTLR start "rule__OntoUMLClass__Group_4__1__Impl"
    // InternalOntoUML.g:691:1: rule__OntoUMLClass__Group_4__1__Impl : ( '{' ) ;
    public final void rule__OntoUMLClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:695:1: ( ( '{' ) )
            // InternalOntoUML.g:696:1: ( '{' )
            {
            // InternalOntoUML.g:696:1: ( '{' )
            // InternalOntoUML.g:697:2: '{'
            {
             before(grammarAccess.getOntoUMLClassAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_4__1__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_4__2"
    // InternalOntoUML.g:706:1: rule__OntoUMLClass__Group_4__2 : rule__OntoUMLClass__Group_4__2__Impl rule__OntoUMLClass__Group_4__3 ;
    public final void rule__OntoUMLClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:710:1: ( rule__OntoUMLClass__Group_4__2__Impl rule__OntoUMLClass__Group_4__3 )
            // InternalOntoUML.g:711:2: rule__OntoUMLClass__Group_4__2__Impl rule__OntoUMLClass__Group_4__3
            {
            pushFollow(FOLLOW_5);
            rule__OntoUMLClass__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_4__3();

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
    // $ANTLR end "rule__OntoUMLClass__Group_4__2"


    // $ANTLR start "rule__OntoUMLClass__Group_4__2__Impl"
    // InternalOntoUML.g:718:1: rule__OntoUMLClass__Group_4__2__Impl : ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 ) ) ;
    public final void rule__OntoUMLClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:722:1: ( ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 ) ) )
            // InternalOntoUML.g:723:1: ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 ) )
            {
            // InternalOntoUML.g:723:1: ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 ) )
            // InternalOntoUML.g:724:2: ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesAssignment_4_2()); 
            // InternalOntoUML.g:725:2: ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 )
            // InternalOntoUML.g:725:3: rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesAssignment_4_2()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_4__2__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_4__3"
    // InternalOntoUML.g:733:1: rule__OntoUMLClass__Group_4__3 : rule__OntoUMLClass__Group_4__3__Impl rule__OntoUMLClass__Group_4__4 ;
    public final void rule__OntoUMLClass__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:737:1: ( rule__OntoUMLClass__Group_4__3__Impl rule__OntoUMLClass__Group_4__4 )
            // InternalOntoUML.g:738:2: rule__OntoUMLClass__Group_4__3__Impl rule__OntoUMLClass__Group_4__4
            {
            pushFollow(FOLLOW_5);
            rule__OntoUMLClass__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_4__4();

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
    // $ANTLR end "rule__OntoUMLClass__Group_4__3"


    // $ANTLR start "rule__OntoUMLClass__Group_4__3__Impl"
    // InternalOntoUML.g:745:1: rule__OntoUMLClass__Group_4__3__Impl : ( ( rule__OntoUMLClass__Group_4_3__0 )* ) ;
    public final void rule__OntoUMLClass__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:749:1: ( ( ( rule__OntoUMLClass__Group_4_3__0 )* ) )
            // InternalOntoUML.g:750:1: ( ( rule__OntoUMLClass__Group_4_3__0 )* )
            {
            // InternalOntoUML.g:750:1: ( ( rule__OntoUMLClass__Group_4_3__0 )* )
            // InternalOntoUML.g:751:2: ( rule__OntoUMLClass__Group_4_3__0 )*
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup_4_3()); 
            // InternalOntoUML.g:752:2: ( rule__OntoUMLClass__Group_4_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOntoUML.g:752:3: rule__OntoUMLClass__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__OntoUMLClass__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getOntoUMLClassAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_4__3__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_4__4"
    // InternalOntoUML.g:760:1: rule__OntoUMLClass__Group_4__4 : rule__OntoUMLClass__Group_4__4__Impl ;
    public final void rule__OntoUMLClass__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:764:1: ( rule__OntoUMLClass__Group_4__4__Impl )
            // InternalOntoUML.g:765:2: rule__OntoUMLClass__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_4__4__Impl();

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
    // $ANTLR end "rule__OntoUMLClass__Group_4__4"


    // $ANTLR start "rule__OntoUMLClass__Group_4__4__Impl"
    // InternalOntoUML.g:771:1: rule__OntoUMLClass__Group_4__4__Impl : ( '}' ) ;
    public final void rule__OntoUMLClass__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:775:1: ( ( '}' ) )
            // InternalOntoUML.g:776:1: ( '}' )
            {
            // InternalOntoUML.g:776:1: ( '}' )
            // InternalOntoUML.g:777:2: '}'
            {
             before(grammarAccess.getOntoUMLClassAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_4__4__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_4_3__0"
    // InternalOntoUML.g:787:1: rule__OntoUMLClass__Group_4_3__0 : rule__OntoUMLClass__Group_4_3__0__Impl rule__OntoUMLClass__Group_4_3__1 ;
    public final void rule__OntoUMLClass__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:791:1: ( rule__OntoUMLClass__Group_4_3__0__Impl rule__OntoUMLClass__Group_4_3__1 )
            // InternalOntoUML.g:792:2: rule__OntoUMLClass__Group_4_3__0__Impl rule__OntoUMLClass__Group_4_3__1
            {
            pushFollow(FOLLOW_8);
            rule__OntoUMLClass__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_4_3__1();

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
    // $ANTLR end "rule__OntoUMLClass__Group_4_3__0"


    // $ANTLR start "rule__OntoUMLClass__Group_4_3__0__Impl"
    // InternalOntoUML.g:799:1: rule__OntoUMLClass__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__OntoUMLClass__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:803:1: ( ( ',' ) )
            // InternalOntoUML.g:804:1: ( ',' )
            {
            // InternalOntoUML.g:804:1: ( ',' )
            // InternalOntoUML.g:805:2: ','
            {
             before(grammarAccess.getOntoUMLClassAccess().getCommaKeyword_4_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_4_3__0__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_4_3__1"
    // InternalOntoUML.g:814:1: rule__OntoUMLClass__Group_4_3__1 : rule__OntoUMLClass__Group_4_3__1__Impl ;
    public final void rule__OntoUMLClass__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:818:1: ( rule__OntoUMLClass__Group_4_3__1__Impl )
            // InternalOntoUML.g:819:2: rule__OntoUMLClass__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__OntoUMLClass__Group_4_3__1"


    // $ANTLR start "rule__OntoUMLClass__Group_4_3__1__Impl"
    // InternalOntoUML.g:825:1: rule__OntoUMLClass__Group_4_3__1__Impl : ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 ) ) ;
    public final void rule__OntoUMLClass__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:829:1: ( ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 ) ) )
            // InternalOntoUML.g:830:1: ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 ) )
            {
            // InternalOntoUML.g:830:1: ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 ) )
            // InternalOntoUML.g:831:2: ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesAssignment_4_3_1()); 
            // InternalOntoUML.g:832:2: ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 )
            // InternalOntoUML.g:832:3: rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_4_3__1__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_5__0"
    // InternalOntoUML.g:841:1: rule__OntoUMLClass__Group_5__0 : rule__OntoUMLClass__Group_5__0__Impl rule__OntoUMLClass__Group_5__1 ;
    public final void rule__OntoUMLClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:845:1: ( rule__OntoUMLClass__Group_5__0__Impl rule__OntoUMLClass__Group_5__1 )
            // InternalOntoUML.g:846:2: rule__OntoUMLClass__Group_5__0__Impl rule__OntoUMLClass__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__OntoUMLClass__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_5__1();

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
    // $ANTLR end "rule__OntoUMLClass__Group_5__0"


    // $ANTLR start "rule__OntoUMLClass__Group_5__0__Impl"
    // InternalOntoUML.g:853:1: rule__OntoUMLClass__Group_5__0__Impl : ( 'subs...' ) ;
    public final void rule__OntoUMLClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:857:1: ( ( 'subs...' ) )
            // InternalOntoUML.g:858:1: ( 'subs...' )
            {
            // InternalOntoUML.g:858:1: ( 'subs...' )
            // InternalOntoUML.g:859:2: 'subs...'
            {
             before(grammarAccess.getOntoUMLClassAccess().getSubsKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getSubsKeyword_5_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_5__0__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_5__1"
    // InternalOntoUML.g:868:1: rule__OntoUMLClass__Group_5__1 : rule__OntoUMLClass__Group_5__1__Impl rule__OntoUMLClass__Group_5__2 ;
    public final void rule__OntoUMLClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:872:1: ( rule__OntoUMLClass__Group_5__1__Impl rule__OntoUMLClass__Group_5__2 )
            // InternalOntoUML.g:873:2: rule__OntoUMLClass__Group_5__1__Impl rule__OntoUMLClass__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__OntoUMLClass__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_5__2();

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
    // $ANTLR end "rule__OntoUMLClass__Group_5__1"


    // $ANTLR start "rule__OntoUMLClass__Group_5__1__Impl"
    // InternalOntoUML.g:880:1: rule__OntoUMLClass__Group_5__1__Impl : ( '{' ) ;
    public final void rule__OntoUMLClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:884:1: ( ( '{' ) )
            // InternalOntoUML.g:885:1: ( '{' )
            {
            // InternalOntoUML.g:885:1: ( '{' )
            // InternalOntoUML.g:886:2: '{'
            {
             before(grammarAccess.getOntoUMLClassAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_5__1__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_5__2"
    // InternalOntoUML.g:895:1: rule__OntoUMLClass__Group_5__2 : rule__OntoUMLClass__Group_5__2__Impl rule__OntoUMLClass__Group_5__3 ;
    public final void rule__OntoUMLClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:899:1: ( rule__OntoUMLClass__Group_5__2__Impl rule__OntoUMLClass__Group_5__3 )
            // InternalOntoUML.g:900:2: rule__OntoUMLClass__Group_5__2__Impl rule__OntoUMLClass__Group_5__3
            {
            pushFollow(FOLLOW_5);
            rule__OntoUMLClass__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_5__3();

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
    // $ANTLR end "rule__OntoUMLClass__Group_5__2"


    // $ANTLR start "rule__OntoUMLClass__Group_5__2__Impl"
    // InternalOntoUML.g:907:1: rule__OntoUMLClass__Group_5__2__Impl : ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 ) ) ;
    public final void rule__OntoUMLClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:911:1: ( ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 ) ) )
            // InternalOntoUML.g:912:1: ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 ) )
            {
            // InternalOntoUML.g:912:1: ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 ) )
            // InternalOntoUML.g:913:2: ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesAssignment_5_2()); 
            // InternalOntoUML.g:914:2: ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 )
            // InternalOntoUML.g:914:3: rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesAssignment_5_2()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_5__2__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_5__3"
    // InternalOntoUML.g:922:1: rule__OntoUMLClass__Group_5__3 : rule__OntoUMLClass__Group_5__3__Impl rule__OntoUMLClass__Group_5__4 ;
    public final void rule__OntoUMLClass__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:926:1: ( rule__OntoUMLClass__Group_5__3__Impl rule__OntoUMLClass__Group_5__4 )
            // InternalOntoUML.g:927:2: rule__OntoUMLClass__Group_5__3__Impl rule__OntoUMLClass__Group_5__4
            {
            pushFollow(FOLLOW_5);
            rule__OntoUMLClass__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_5__4();

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
    // $ANTLR end "rule__OntoUMLClass__Group_5__3"


    // $ANTLR start "rule__OntoUMLClass__Group_5__3__Impl"
    // InternalOntoUML.g:934:1: rule__OntoUMLClass__Group_5__3__Impl : ( ( rule__OntoUMLClass__Group_5_3__0 )* ) ;
    public final void rule__OntoUMLClass__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:938:1: ( ( ( rule__OntoUMLClass__Group_5_3__0 )* ) )
            // InternalOntoUML.g:939:1: ( ( rule__OntoUMLClass__Group_5_3__0 )* )
            {
            // InternalOntoUML.g:939:1: ( ( rule__OntoUMLClass__Group_5_3__0 )* )
            // InternalOntoUML.g:940:2: ( rule__OntoUMLClass__Group_5_3__0 )*
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup_5_3()); 
            // InternalOntoUML.g:941:2: ( rule__OntoUMLClass__Group_5_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOntoUML.g:941:3: rule__OntoUMLClass__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__OntoUMLClass__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getOntoUMLClassAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_5__3__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_5__4"
    // InternalOntoUML.g:949:1: rule__OntoUMLClass__Group_5__4 : rule__OntoUMLClass__Group_5__4__Impl ;
    public final void rule__OntoUMLClass__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:953:1: ( rule__OntoUMLClass__Group_5__4__Impl )
            // InternalOntoUML.g:954:2: rule__OntoUMLClass__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_5__4__Impl();

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
    // $ANTLR end "rule__OntoUMLClass__Group_5__4"


    // $ANTLR start "rule__OntoUMLClass__Group_5__4__Impl"
    // InternalOntoUML.g:960:1: rule__OntoUMLClass__Group_5__4__Impl : ( '}' ) ;
    public final void rule__OntoUMLClass__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:964:1: ( ( '}' ) )
            // InternalOntoUML.g:965:1: ( '}' )
            {
            // InternalOntoUML.g:965:1: ( '}' )
            // InternalOntoUML.g:966:2: '}'
            {
             before(grammarAccess.getOntoUMLClassAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_5__4__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_5_3__0"
    // InternalOntoUML.g:976:1: rule__OntoUMLClass__Group_5_3__0 : rule__OntoUMLClass__Group_5_3__0__Impl rule__OntoUMLClass__Group_5_3__1 ;
    public final void rule__OntoUMLClass__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:980:1: ( rule__OntoUMLClass__Group_5_3__0__Impl rule__OntoUMLClass__Group_5_3__1 )
            // InternalOntoUML.g:981:2: rule__OntoUMLClass__Group_5_3__0__Impl rule__OntoUMLClass__Group_5_3__1
            {
            pushFollow(FOLLOW_8);
            rule__OntoUMLClass__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_5_3__1();

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
    // $ANTLR end "rule__OntoUMLClass__Group_5_3__0"


    // $ANTLR start "rule__OntoUMLClass__Group_5_3__0__Impl"
    // InternalOntoUML.g:988:1: rule__OntoUMLClass__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__OntoUMLClass__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:992:1: ( ( ',' ) )
            // InternalOntoUML.g:993:1: ( ',' )
            {
            // InternalOntoUML.g:993:1: ( ',' )
            // InternalOntoUML.g:994:2: ','
            {
             before(grammarAccess.getOntoUMLClassAccess().getCommaKeyword_5_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_5_3__0__Impl"


    // $ANTLR start "rule__OntoUMLClass__Group_5_3__1"
    // InternalOntoUML.g:1003:1: rule__OntoUMLClass__Group_5_3__1 : rule__OntoUMLClass__Group_5_3__1__Impl ;
    public final void rule__OntoUMLClass__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1007:1: ( rule__OntoUMLClass__Group_5_3__1__Impl )
            // InternalOntoUML.g:1008:2: rule__OntoUMLClass__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__OntoUMLClass__Group_5_3__1"


    // $ANTLR start "rule__OntoUMLClass__Group_5_3__1__Impl"
    // InternalOntoUML.g:1014:1: rule__OntoUMLClass__Group_5_3__1__Impl : ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 ) ) ;
    public final void rule__OntoUMLClass__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1018:1: ( ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 ) ) )
            // InternalOntoUML.g:1019:1: ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 ) )
            {
            // InternalOntoUML.g:1019:1: ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 ) )
            // InternalOntoUML.g:1020:2: ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesAssignment_5_3_1()); 
            // InternalOntoUML.g:1021:2: ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 )
            // InternalOntoUML.g:1021:3: rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesAssignment_5_3_1()); 

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
    // $ANTLR end "rule__OntoUMLClass__Group_5_3__1__Impl"


    // $ANTLR start "rule__Generalization__Group__0"
    // InternalOntoUML.g:1030:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1034:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalOntoUML.g:1035:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUML.g:1042:1: rule__Generalization__Group__0__Impl : ( 'Generalization' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1046:1: ( ( 'Generalization' ) )
            // InternalOntoUML.g:1047:1: ( 'Generalization' )
            {
            // InternalOntoUML.g:1047:1: ( 'Generalization' )
            // InternalOntoUML.g:1048:2: 'Generalization'
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
    // InternalOntoUML.g:1057:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1061:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalOntoUML.g:1062:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalOntoUML.g:1069:1: rule__Generalization__Group__1__Impl : ( ( rule__Generalization__NameAssignment_1 ) ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1073:1: ( ( ( rule__Generalization__NameAssignment_1 ) ) )
            // InternalOntoUML.g:1074:1: ( ( rule__Generalization__NameAssignment_1 ) )
            {
            // InternalOntoUML.g:1074:1: ( ( rule__Generalization__NameAssignment_1 ) )
            // InternalOntoUML.g:1075:2: ( rule__Generalization__NameAssignment_1 )
            {
             before(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 
            // InternalOntoUML.g:1076:2: ( rule__Generalization__NameAssignment_1 )
            // InternalOntoUML.g:1076:3: rule__Generalization__NameAssignment_1
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
    // InternalOntoUML.g:1084:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1088:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalOntoUML.g:1089:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalOntoUML.g:1096:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__AliasAssignment_2 )? ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1100:1: ( ( ( rule__Generalization__AliasAssignment_2 )? ) )
            // InternalOntoUML.g:1101:1: ( ( rule__Generalization__AliasAssignment_2 )? )
            {
            // InternalOntoUML.g:1101:1: ( ( rule__Generalization__AliasAssignment_2 )? )
            // InternalOntoUML.g:1102:2: ( rule__Generalization__AliasAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationAccess().getAliasAssignment_2()); 
            // InternalOntoUML.g:1103:2: ( rule__Generalization__AliasAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoUML.g:1103:3: rule__Generalization__AliasAssignment_2
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
    // InternalOntoUML.g:1111:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1115:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalOntoUML.g:1116:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUML.g:1123:1: rule__Generalization__Group__3__Impl : ( 'superclass' ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1127:1: ( ( 'superclass' ) )
            // InternalOntoUML.g:1128:1: ( 'superclass' )
            {
            // InternalOntoUML.g:1128:1: ( 'superclass' )
            // InternalOntoUML.g:1129:2: 'superclass'
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
    // InternalOntoUML.g:1138:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl rule__Generalization__Group__5 ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1142:1: ( rule__Generalization__Group__4__Impl rule__Generalization__Group__5 )
            // InternalOntoUML.g:1143:2: rule__Generalization__Group__4__Impl rule__Generalization__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalOntoUML.g:1150:1: rule__Generalization__Group__4__Impl : ( ( rule__Generalization__SuperclassAssignment_4 ) ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1154:1: ( ( ( rule__Generalization__SuperclassAssignment_4 ) ) )
            // InternalOntoUML.g:1155:1: ( ( rule__Generalization__SuperclassAssignment_4 ) )
            {
            // InternalOntoUML.g:1155:1: ( ( rule__Generalization__SuperclassAssignment_4 ) )
            // InternalOntoUML.g:1156:2: ( rule__Generalization__SuperclassAssignment_4 )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperclassAssignment_4()); 
            // InternalOntoUML.g:1157:2: ( rule__Generalization__SuperclassAssignment_4 )
            // InternalOntoUML.g:1157:3: rule__Generalization__SuperclassAssignment_4
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
    // InternalOntoUML.g:1165:1: rule__Generalization__Group__5 : rule__Generalization__Group__5__Impl rule__Generalization__Group__6 ;
    public final void rule__Generalization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1169:1: ( rule__Generalization__Group__5__Impl rule__Generalization__Group__6 )
            // InternalOntoUML.g:1170:2: rule__Generalization__Group__5__Impl rule__Generalization__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUML.g:1177:1: rule__Generalization__Group__5__Impl : ( 'subclass' ) ;
    public final void rule__Generalization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1181:1: ( ( 'subclass' ) )
            // InternalOntoUML.g:1182:1: ( 'subclass' )
            {
            // InternalOntoUML.g:1182:1: ( 'subclass' )
            // InternalOntoUML.g:1183:2: 'subclass'
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
    // InternalOntoUML.g:1192:1: rule__Generalization__Group__6 : rule__Generalization__Group__6__Impl ;
    public final void rule__Generalization__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1196:1: ( rule__Generalization__Group__6__Impl )
            // InternalOntoUML.g:1197:2: rule__Generalization__Group__6__Impl
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
    // InternalOntoUML.g:1203:1: rule__Generalization__Group__6__Impl : ( ( rule__Generalization__SubclassAssignment_6 ) ) ;
    public final void rule__Generalization__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1207:1: ( ( ( rule__Generalization__SubclassAssignment_6 ) ) )
            // InternalOntoUML.g:1208:1: ( ( rule__Generalization__SubclassAssignment_6 ) )
            {
            // InternalOntoUML.g:1208:1: ( ( rule__Generalization__SubclassAssignment_6 ) )
            // InternalOntoUML.g:1209:2: ( rule__Generalization__SubclassAssignment_6 )
            {
             before(grammarAccess.getGeneralizationAccess().getSubclassAssignment_6()); 
            // InternalOntoUML.g:1210:2: ( rule__Generalization__SubclassAssignment_6 )
            // InternalOntoUML.g:1210:3: rule__Generalization__SubclassAssignment_6
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
    // InternalOntoUML.g:1219:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1223:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoUML.g:1224:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalOntoUML.g:1231:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0 ) ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1235:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0 ) ) )
            // InternalOntoUML.g:1236:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0 ) )
            {
            // InternalOntoUML.g:1236:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0 ) )
            // InternalOntoUML.g:1237:2: ( rule__GeneralizationSet__IsDisjointAssignment_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0()); 
            // InternalOntoUML.g:1238:2: ( rule__GeneralizationSet__IsDisjointAssignment_0 )
            // InternalOntoUML.g:1238:3: rule__GeneralizationSet__IsDisjointAssignment_0
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
    // InternalOntoUML.g:1246:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1250:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoUML.g:1251:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalOntoUML.g:1258:1: rule__GeneralizationSet__Group__1__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_1 ) ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1262:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1 ) ) )
            // InternalOntoUML.g:1263:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_1 ) )
            {
            // InternalOntoUML.g:1263:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_1 ) )
            // InternalOntoUML.g:1264:2: ( rule__GeneralizationSet__IsCompleteAssignment_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_1()); 
            // InternalOntoUML.g:1265:2: ( rule__GeneralizationSet__IsCompleteAssignment_1 )
            // InternalOntoUML.g:1265:3: rule__GeneralizationSet__IsCompleteAssignment_1
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
    // InternalOntoUML.g:1273:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1277:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoUML.g:1278:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUML.g:1285:1: rule__GeneralizationSet__Group__2__Impl : ( 'GeneralizationSet' ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1289:1: ( ( 'GeneralizationSet' ) )
            // InternalOntoUML.g:1290:1: ( 'GeneralizationSet' )
            {
            // InternalOntoUML.g:1290:1: ( 'GeneralizationSet' )
            // InternalOntoUML.g:1291:2: 'GeneralizationSet'
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
    // InternalOntoUML.g:1300:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1304:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalOntoUML.g:1305:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUML.g:1312:1: rule__GeneralizationSet__Group__3__Impl : ( ( rule__GeneralizationSet__NameAssignment_3 ) ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1316:1: ( ( ( rule__GeneralizationSet__NameAssignment_3 ) ) )
            // InternalOntoUML.g:1317:1: ( ( rule__GeneralizationSet__NameAssignment_3 ) )
            {
            // InternalOntoUML.g:1317:1: ( ( rule__GeneralizationSet__NameAssignment_3 ) )
            // InternalOntoUML.g:1318:2: ( rule__GeneralizationSet__NameAssignment_3 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_3()); 
            // InternalOntoUML.g:1319:2: ( rule__GeneralizationSet__NameAssignment_3 )
            // InternalOntoUML.g:1319:3: rule__GeneralizationSet__NameAssignment_3
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
    // InternalOntoUML.g:1327:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1331:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalOntoUML.g:1332:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalOntoUML.g:1339:1: rule__GeneralizationSet__Group__4__Impl : ( ( rule__GeneralizationSet__AliasAssignment_4 )? ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1343:1: ( ( ( rule__GeneralizationSet__AliasAssignment_4 )? ) )
            // InternalOntoUML.g:1344:1: ( ( rule__GeneralizationSet__AliasAssignment_4 )? )
            {
            // InternalOntoUML.g:1344:1: ( ( rule__GeneralizationSet__AliasAssignment_4 )? )
            // InternalOntoUML.g:1345:2: ( rule__GeneralizationSet__AliasAssignment_4 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getAliasAssignment_4()); 
            // InternalOntoUML.g:1346:2: ( rule__GeneralizationSet__AliasAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUML.g:1346:3: rule__GeneralizationSet__AliasAssignment_4
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
    // InternalOntoUML.g:1354:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1358:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalOntoUML.g:1359:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUML.g:1366:1: rule__GeneralizationSet__Group__5__Impl : ( 'generalizations' ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1370:1: ( ( 'generalizations' ) )
            // InternalOntoUML.g:1371:1: ( 'generalizations' )
            {
            // InternalOntoUML.g:1371:1: ( 'generalizations' )
            // InternalOntoUML.g:1372:2: 'generalizations'
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
    // InternalOntoUML.g:1381:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1385:1: ( rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 )
            // InternalOntoUML.g:1386:2: rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalOntoUML.g:1393:1: rule__GeneralizationSet__Group__6__Impl : ( ( rule__GeneralizationSet__GeneralizationsAssignment_6 ) ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1397:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_6 ) ) )
            // InternalOntoUML.g:1398:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_6 ) )
            {
            // InternalOntoUML.g:1398:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_6 ) )
            // InternalOntoUML.g:1399:2: ( rule__GeneralizationSet__GeneralizationsAssignment_6 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_6()); 
            // InternalOntoUML.g:1400:2: ( rule__GeneralizationSet__GeneralizationsAssignment_6 )
            // InternalOntoUML.g:1400:3: rule__GeneralizationSet__GeneralizationsAssignment_6
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
    // InternalOntoUML.g:1408:1: rule__GeneralizationSet__Group__7 : rule__GeneralizationSet__Group__7__Impl ;
    public final void rule__GeneralizationSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1412:1: ( rule__GeneralizationSet__Group__7__Impl )
            // InternalOntoUML.g:1413:2: rule__GeneralizationSet__Group__7__Impl
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
    // InternalOntoUML.g:1419:1: rule__GeneralizationSet__Group__7__Impl : ( ( rule__GeneralizationSet__Group_7__0 )* ) ;
    public final void rule__GeneralizationSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1423:1: ( ( ( rule__GeneralizationSet__Group_7__0 )* ) )
            // InternalOntoUML.g:1424:1: ( ( rule__GeneralizationSet__Group_7__0 )* )
            {
            // InternalOntoUML.g:1424:1: ( ( rule__GeneralizationSet__Group_7__0 )* )
            // InternalOntoUML.g:1425:2: ( rule__GeneralizationSet__Group_7__0 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_7()); 
            // InternalOntoUML.g:1426:2: ( rule__GeneralizationSet__Group_7__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==RULE_ID) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalOntoUML.g:1426:3: rule__GeneralizationSet__Group_7__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GeneralizationSet__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalOntoUML.g:1435:1: rule__GeneralizationSet__Group_7__0 : rule__GeneralizationSet__Group_7__0__Impl rule__GeneralizationSet__Group_7__1 ;
    public final void rule__GeneralizationSet__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1439:1: ( rule__GeneralizationSet__Group_7__0__Impl rule__GeneralizationSet__Group_7__1 )
            // InternalOntoUML.g:1440:2: rule__GeneralizationSet__Group_7__0__Impl rule__GeneralizationSet__Group_7__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUML.g:1447:1: rule__GeneralizationSet__Group_7__0__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1451:1: ( ( ',' ) )
            // InternalOntoUML.g:1452:1: ( ',' )
            {
            // InternalOntoUML.g:1452:1: ( ',' )
            // InternalOntoUML.g:1453:2: ','
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
    // InternalOntoUML.g:1462:1: rule__GeneralizationSet__Group_7__1 : rule__GeneralizationSet__Group_7__1__Impl ;
    public final void rule__GeneralizationSet__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1466:1: ( rule__GeneralizationSet__Group_7__1__Impl )
            // InternalOntoUML.g:1467:2: rule__GeneralizationSet__Group_7__1__Impl
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
    // InternalOntoUML.g:1473:1: rule__GeneralizationSet__Group_7__1__Impl : ( ( rule__GeneralizationSet__GeneralizationsAssignment_7_1 ) ) ;
    public final void rule__GeneralizationSet__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1477:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_7_1 ) ) )
            // InternalOntoUML.g:1478:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_7_1 ) )
            {
            // InternalOntoUML.g:1478:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_7_1 ) )
            // InternalOntoUML.g:1479:2: ( rule__GeneralizationSet__GeneralizationsAssignment_7_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_7_1()); 
            // InternalOntoUML.g:1480:2: ( rule__GeneralizationSet__GeneralizationsAssignment_7_1 )
            // InternalOntoUML.g:1480:3: rule__GeneralizationSet__GeneralizationsAssignment_7_1
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
    // InternalOntoUML.g:1489:1: rule__Model__ElementsAssignment_2 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1493:1: ( ( ruleModelElement ) )
            // InternalOntoUML.g:1494:2: ( ruleModelElement )
            {
            // InternalOntoUML.g:1494:2: ( ruleModelElement )
            // InternalOntoUML.g:1495:3: ruleModelElement
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
    // InternalOntoUML.g:1504:1: rule__Model__ElementsAssignment_3_1 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1508:1: ( ( ruleModelElement ) )
            // InternalOntoUML.g:1509:2: ( ruleModelElement )
            {
            // InternalOntoUML.g:1509:2: ( ruleModelElement )
            // InternalOntoUML.g:1510:3: ruleModelElement
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


    // $ANTLR start "rule__OntoUMLClass___typeAssignment_0"
    // InternalOntoUML.g:1519:1: rule__OntoUMLClass___typeAssignment_0 : ( ruleEndurantType ) ;
    public final void rule__OntoUMLClass___typeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1523:1: ( ( ruleEndurantType ) )
            // InternalOntoUML.g:1524:2: ( ruleEndurantType )
            {
            // InternalOntoUML.g:1524:2: ( ruleEndurantType )
            // InternalOntoUML.g:1525:3: ruleEndurantType
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
    // InternalOntoUML.g:1534:1: rule__OntoUMLClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OntoUMLClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1538:1: ( ( RULE_ID ) )
            // InternalOntoUML.g:1539:2: ( RULE_ID )
            {
            // InternalOntoUML.g:1539:2: ( RULE_ID )
            // InternalOntoUML.g:1540:3: RULE_ID
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
    // InternalOntoUML.g:1549:1: rule__OntoUMLClass__AliasAssignment_3 : ( RULE_STRING ) ;
    public final void rule__OntoUMLClass__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1553:1: ( ( RULE_STRING ) )
            // InternalOntoUML.g:1554:2: ( RULE_STRING )
            {
            // InternalOntoUML.g:1554:2: ( RULE_STRING )
            // InternalOntoUML.g:1555:3: RULE_STRING
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


    // $ANTLR start "rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2"
    // InternalOntoUML.g:1564:1: rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1568:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1569:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1569:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1570:3: ( RULE_ID )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesGeneralizationCrossReference_4_2_0()); 
            // InternalOntoUML.g:1571:3: ( RULE_ID )
            // InternalOntoUML.g:1572:4: RULE_ID
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesGeneralizationIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesGeneralizationIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesGeneralizationCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2"


    // $ANTLR start "rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1"
    // InternalOntoUML.g:1583:1: rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1587:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1588:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1588:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1589:3: ( RULE_ID )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesGeneralizationCrossReference_4_3_1_0()); 
            // InternalOntoUML.g:1590:3: ( RULE_ID )
            // InternalOntoUML.g:1591:4: RULE_ID
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesGeneralizationIDTerminalRuleCall_4_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesGeneralizationIDTerminalRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesGeneralizationCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1"


    // $ANTLR start "rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2"
    // InternalOntoUML.g:1602:1: rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1606:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1607:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1607:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1608:3: ( RULE_ID )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesGeneralizationCrossReference_5_2_0()); 
            // InternalOntoUML.g:1609:3: ( RULE_ID )
            // InternalOntoUML.g:1610:4: RULE_ID
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesGeneralizationIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesGeneralizationIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesGeneralizationCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2"


    // $ANTLR start "rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1"
    // InternalOntoUML.g:1621:1: rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1625:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1626:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1626:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1627:3: ( RULE_ID )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesGeneralizationCrossReference_5_3_1_0()); 
            // InternalOntoUML.g:1628:3: ( RULE_ID )
            // InternalOntoUML.g:1629:4: RULE_ID
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesGeneralizationIDTerminalRuleCall_5_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesGeneralizationIDTerminalRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesGeneralizationCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1"


    // $ANTLR start "rule__Generalization__NameAssignment_1"
    // InternalOntoUML.g:1640:1: rule__Generalization__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Generalization__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1644:1: ( ( RULE_ID ) )
            // InternalOntoUML.g:1645:2: ( RULE_ID )
            {
            // InternalOntoUML.g:1645:2: ( RULE_ID )
            // InternalOntoUML.g:1646:3: RULE_ID
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
    // InternalOntoUML.g:1655:1: rule__Generalization__AliasAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Generalization__AliasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1659:1: ( ( RULE_STRING ) )
            // InternalOntoUML.g:1660:2: ( RULE_STRING )
            {
            // InternalOntoUML.g:1660:2: ( RULE_STRING )
            // InternalOntoUML.g:1661:3: RULE_STRING
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
    // InternalOntoUML.g:1670:1: rule__Generalization__SuperclassAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Generalization__SuperclassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1674:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1675:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1675:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1676:3: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperclassOntoUMLClassCrossReference_4_0()); 
            // InternalOntoUML.g:1677:3: ( RULE_ID )
            // InternalOntoUML.g:1678:4: RULE_ID
            {
             before(grammarAccess.getGeneralizationAccess().getSuperclassOntoUMLClassIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getSuperclassOntoUMLClassIDTerminalRuleCall_4_0_1()); 

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
    // InternalOntoUML.g:1689:1: rule__Generalization__SubclassAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Generalization__SubclassAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1693:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1694:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1694:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1695:3: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizationAccess().getSubclassOntoUMLClassCrossReference_6_0()); 
            // InternalOntoUML.g:1696:3: ( RULE_ID )
            // InternalOntoUML.g:1697:4: RULE_ID
            {
             before(grammarAccess.getGeneralizationAccess().getSubclassOntoUMLClassIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralizationAccess().getSubclassOntoUMLClassIDTerminalRuleCall_6_0_1()); 

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
    // InternalOntoUML.g:1708:1: rule__GeneralizationSet__IsDisjointAssignment_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1712:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoUML.g:1713:2: ( ( 'disjoint' ) )
            {
            // InternalOntoUML.g:1713:2: ( ( 'disjoint' ) )
            // InternalOntoUML.g:1714:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0()); 
            // InternalOntoUML.g:1715:3: ( 'disjoint' )
            // InternalOntoUML.g:1716:4: 'disjoint'
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
    // InternalOntoUML.g:1727:1: rule__GeneralizationSet__IsCompleteAssignment_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1731:1: ( ( ( 'complete' ) ) )
            // InternalOntoUML.g:1732:2: ( ( 'complete' ) )
            {
            // InternalOntoUML.g:1732:2: ( ( 'complete' ) )
            // InternalOntoUML.g:1733:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_0()); 
            // InternalOntoUML.g:1734:3: ( 'complete' )
            // InternalOntoUML.g:1735:4: 'complete'
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
    // InternalOntoUML.g:1746:1: rule__GeneralizationSet__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__GeneralizationSet__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1750:1: ( ( RULE_ID ) )
            // InternalOntoUML.g:1751:2: ( RULE_ID )
            {
            // InternalOntoUML.g:1751:2: ( RULE_ID )
            // InternalOntoUML.g:1752:3: RULE_ID
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
    // InternalOntoUML.g:1761:1: rule__GeneralizationSet__AliasAssignment_4 : ( RULE_STRING ) ;
    public final void rule__GeneralizationSet__AliasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1765:1: ( ( RULE_STRING ) )
            // InternalOntoUML.g:1766:2: ( RULE_STRING )
            {
            // InternalOntoUML.g:1766:2: ( RULE_STRING )
            // InternalOntoUML.g:1767:3: RULE_STRING
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
    // InternalOntoUML.g:1776:1: rule__GeneralizationSet__GeneralizationsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1780:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1781:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1781:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1782:3: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_6_0()); 
            // InternalOntoUML.g:1783:3: ( RULE_ID )
            // InternalOntoUML.g:1784:4: RULE_ID
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationIDTerminalRuleCall_6_0_1()); 

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
    // InternalOntoUML.g:1795:1: rule__GeneralizationSet__GeneralizationsAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1799:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1800:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1800:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1801:3: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_7_1_0()); 
            // InternalOntoUML.g:1802:3: ( RULE_ID )
            // InternalOntoUML.g:1803:4: RULE_ID
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationIDTerminalRuleCall_7_1_0_1()); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000008407FF800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000030000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});

}