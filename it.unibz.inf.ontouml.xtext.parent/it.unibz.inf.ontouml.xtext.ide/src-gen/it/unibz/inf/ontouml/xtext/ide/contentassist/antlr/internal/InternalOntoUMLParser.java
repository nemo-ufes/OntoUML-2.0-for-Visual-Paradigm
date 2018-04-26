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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'none'", "'kind'", "'relatorKind'", "'modeKind'", "'qualityKind'", "'subkind'", "'role'", "'phase'", "'category'", "'mixin'", "'roleMixin'", "'Model'", "'{'", "'}'", "','", "'Class'", "'supers...'", "'subs...'", "'Generalization'", "'superclass'", "'subclass'", "'GeneralizationSet'", "'generalizations'", "'disjoint'", "'complete'"
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
            case 26:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 34:
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
    // InternalOntoUML.g:220:1: rule__EndurantType__Alternatives : ( ( ( 'none' ) ) | ( ( 'kind' ) ) | ( ( 'relatorKind' ) ) | ( ( 'modeKind' ) ) | ( ( 'qualityKind' ) ) | ( ( 'subkind' ) ) | ( ( 'role' ) ) | ( ( 'phase' ) ) | ( ( 'category' ) ) | ( ( 'mixin' ) ) | ( ( 'roleMixin' ) ) );
    public final void rule__EndurantType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:224:1: ( ( ( 'none' ) ) | ( ( 'kind' ) ) | ( ( 'relatorKind' ) ) | ( ( 'modeKind' ) ) | ( ( 'qualityKind' ) ) | ( ( 'subkind' ) ) | ( ( 'role' ) ) | ( ( 'phase' ) ) | ( ( 'category' ) ) | ( ( 'mixin' ) ) | ( ( 'roleMixin' ) ) )
            int alt2=11;
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
    // InternalOntoUML.g:295:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:299:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalOntoUML.g:300:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalOntoUML.g:307:1: rule__Model__Group__0__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:311:1: ( ( 'Model' ) )
            // InternalOntoUML.g:312:1: ( 'Model' )
            {
            // InternalOntoUML.g:312:1: ( 'Model' )
            // InternalOntoUML.g:313:2: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalOntoUML.g:322:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:326:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalOntoUML.g:327:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalOntoUML.g:334:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:338:1: ( ( '{' ) )
            // InternalOntoUML.g:339:1: ( '{' )
            {
            // InternalOntoUML.g:339:1: ( '{' )
            // InternalOntoUML.g:340:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalOntoUML.g:349:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:353:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalOntoUML.g:354:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalOntoUML.g:361:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementsAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:365:1: ( ( ( rule__Model__ElementsAssignment_2 ) ) )
            // InternalOntoUML.g:366:1: ( ( rule__Model__ElementsAssignment_2 ) )
            {
            // InternalOntoUML.g:366:1: ( ( rule__Model__ElementsAssignment_2 ) )
            // InternalOntoUML.g:367:2: ( rule__Model__ElementsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_2()); 
            // InternalOntoUML.g:368:2: ( rule__Model__ElementsAssignment_2 )
            // InternalOntoUML.g:368:3: rule__Model__ElementsAssignment_2
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
    // InternalOntoUML.g:376:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:380:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalOntoUML.g:381:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalOntoUML.g:388:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:392:1: ( ( ( rule__Model__Group_3__0 )* ) )
            // InternalOntoUML.g:393:1: ( ( rule__Model__Group_3__0 )* )
            {
            // InternalOntoUML.g:393:1: ( ( rule__Model__Group_3__0 )* )
            // InternalOntoUML.g:394:2: ( rule__Model__Group_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // InternalOntoUML.g:395:2: ( rule__Model__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOntoUML.g:395:3: rule__Model__Group_3__0
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
    // InternalOntoUML.g:403:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:407:1: ( rule__Model__Group__4__Impl )
            // InternalOntoUML.g:408:2: rule__Model__Group__4__Impl
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
    // InternalOntoUML.g:414:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:418:1: ( ( '}' ) )
            // InternalOntoUML.g:419:1: ( '}' )
            {
            // InternalOntoUML.g:419:1: ( '}' )
            // InternalOntoUML.g:420:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalOntoUML.g:430:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:434:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // InternalOntoUML.g:435:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
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
    // InternalOntoUML.g:442:1: rule__Model__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:446:1: ( ( ',' ) )
            // InternalOntoUML.g:447:1: ( ',' )
            {
            // InternalOntoUML.g:447:1: ( ',' )
            // InternalOntoUML.g:448:2: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOntoUML.g:457:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:461:1: ( rule__Model__Group_3__1__Impl )
            // InternalOntoUML.g:462:2: rule__Model__Group_3__1__Impl
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
    // InternalOntoUML.g:468:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__ElementsAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:472:1: ( ( ( rule__Model__ElementsAssignment_3_1 ) ) )
            // InternalOntoUML.g:473:1: ( ( rule__Model__ElementsAssignment_3_1 ) )
            {
            // InternalOntoUML.g:473:1: ( ( rule__Model__ElementsAssignment_3_1 ) )
            // InternalOntoUML.g:474:2: ( rule__Model__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 
            // InternalOntoUML.g:475:2: ( rule__Model__ElementsAssignment_3_1 )
            // InternalOntoUML.g:475:3: rule__Model__ElementsAssignment_3_1
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
    // InternalOntoUML.g:484:1: rule__OntoUMLClass__Group__0 : rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1 ;
    public final void rule__OntoUMLClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:488:1: ( rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1 )
            // InternalOntoUML.g:489:2: rule__OntoUMLClass__Group__0__Impl rule__OntoUMLClass__Group__1
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
    // InternalOntoUML.g:496:1: rule__OntoUMLClass__Group__0__Impl : ( ( rule__OntoUMLClass___typeAssignment_0 )? ) ;
    public final void rule__OntoUMLClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:500:1: ( ( ( rule__OntoUMLClass___typeAssignment_0 )? ) )
            // InternalOntoUML.g:501:1: ( ( rule__OntoUMLClass___typeAssignment_0 )? )
            {
            // InternalOntoUML.g:501:1: ( ( rule__OntoUMLClass___typeAssignment_0 )? )
            // InternalOntoUML.g:502:2: ( rule__OntoUMLClass___typeAssignment_0 )?
            {
             before(grammarAccess.getOntoUMLClassAccess().get_typeAssignment_0()); 
            // InternalOntoUML.g:503:2: ( rule__OntoUMLClass___typeAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=21)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoUML.g:503:3: rule__OntoUMLClass___typeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OntoUMLClass___typeAssignment_0();

                    state._fsp--;


                    }
                    break;

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
    // InternalOntoUML.g:511:1: rule__OntoUMLClass__Group__1 : rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2 ;
    public final void rule__OntoUMLClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:515:1: ( rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2 )
            // InternalOntoUML.g:516:2: rule__OntoUMLClass__Group__1__Impl rule__OntoUMLClass__Group__2
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
    // InternalOntoUML.g:523:1: rule__OntoUMLClass__Group__1__Impl : ( 'Class' ) ;
    public final void rule__OntoUMLClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:527:1: ( ( 'Class' ) )
            // InternalOntoUML.g:528:1: ( 'Class' )
            {
            // InternalOntoUML.g:528:1: ( 'Class' )
            // InternalOntoUML.g:529:2: 'Class'
            {
             before(grammarAccess.getOntoUMLClassAccess().getClassKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalOntoUML.g:538:1: rule__OntoUMLClass__Group__2 : rule__OntoUMLClass__Group__2__Impl rule__OntoUMLClass__Group__3 ;
    public final void rule__OntoUMLClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:542:1: ( rule__OntoUMLClass__Group__2__Impl rule__OntoUMLClass__Group__3 )
            // InternalOntoUML.g:543:2: rule__OntoUMLClass__Group__2__Impl rule__OntoUMLClass__Group__3
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
    // InternalOntoUML.g:550:1: rule__OntoUMLClass__Group__2__Impl : ( ( rule__OntoUMLClass__NameAssignment_2 ) ) ;
    public final void rule__OntoUMLClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:554:1: ( ( ( rule__OntoUMLClass__NameAssignment_2 ) ) )
            // InternalOntoUML.g:555:1: ( ( rule__OntoUMLClass__NameAssignment_2 ) )
            {
            // InternalOntoUML.g:555:1: ( ( rule__OntoUMLClass__NameAssignment_2 ) )
            // InternalOntoUML.g:556:2: ( rule__OntoUMLClass__NameAssignment_2 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getNameAssignment_2()); 
            // InternalOntoUML.g:557:2: ( rule__OntoUMLClass__NameAssignment_2 )
            // InternalOntoUML.g:557:3: rule__OntoUMLClass__NameAssignment_2
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
    // InternalOntoUML.g:565:1: rule__OntoUMLClass__Group__3 : rule__OntoUMLClass__Group__3__Impl rule__OntoUMLClass__Group__4 ;
    public final void rule__OntoUMLClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:569:1: ( rule__OntoUMLClass__Group__3__Impl rule__OntoUMLClass__Group__4 )
            // InternalOntoUML.g:570:2: rule__OntoUMLClass__Group__3__Impl rule__OntoUMLClass__Group__4
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
    // InternalOntoUML.g:577:1: rule__OntoUMLClass__Group__3__Impl : ( ( rule__OntoUMLClass__AliasAssignment_3 )? ) ;
    public final void rule__OntoUMLClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:581:1: ( ( ( rule__OntoUMLClass__AliasAssignment_3 )? ) )
            // InternalOntoUML.g:582:1: ( ( rule__OntoUMLClass__AliasAssignment_3 )? )
            {
            // InternalOntoUML.g:582:1: ( ( rule__OntoUMLClass__AliasAssignment_3 )? )
            // InternalOntoUML.g:583:2: ( rule__OntoUMLClass__AliasAssignment_3 )?
            {
             before(grammarAccess.getOntoUMLClassAccess().getAliasAssignment_3()); 
            // InternalOntoUML.g:584:2: ( rule__OntoUMLClass__AliasAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntoUML.g:584:3: rule__OntoUMLClass__AliasAssignment_3
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
    // InternalOntoUML.g:592:1: rule__OntoUMLClass__Group__4 : rule__OntoUMLClass__Group__4__Impl rule__OntoUMLClass__Group__5 ;
    public final void rule__OntoUMLClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:596:1: ( rule__OntoUMLClass__Group__4__Impl rule__OntoUMLClass__Group__5 )
            // InternalOntoUML.g:597:2: rule__OntoUMLClass__Group__4__Impl rule__OntoUMLClass__Group__5
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
    // InternalOntoUML.g:604:1: rule__OntoUMLClass__Group__4__Impl : ( ( rule__OntoUMLClass__Group_4__0 )? ) ;
    public final void rule__OntoUMLClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:608:1: ( ( ( rule__OntoUMLClass__Group_4__0 )? ) )
            // InternalOntoUML.g:609:1: ( ( rule__OntoUMLClass__Group_4__0 )? )
            {
            // InternalOntoUML.g:609:1: ( ( rule__OntoUMLClass__Group_4__0 )? )
            // InternalOntoUML.g:610:2: ( rule__OntoUMLClass__Group_4__0 )?
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup_4()); 
            // InternalOntoUML.g:611:2: ( rule__OntoUMLClass__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoUML.g:611:3: rule__OntoUMLClass__Group_4__0
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
    // InternalOntoUML.g:619:1: rule__OntoUMLClass__Group__5 : rule__OntoUMLClass__Group__5__Impl ;
    public final void rule__OntoUMLClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:623:1: ( rule__OntoUMLClass__Group__5__Impl )
            // InternalOntoUML.g:624:2: rule__OntoUMLClass__Group__5__Impl
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
    // InternalOntoUML.g:630:1: rule__OntoUMLClass__Group__5__Impl : ( ( rule__OntoUMLClass__Group_5__0 )? ) ;
    public final void rule__OntoUMLClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:634:1: ( ( ( rule__OntoUMLClass__Group_5__0 )? ) )
            // InternalOntoUML.g:635:1: ( ( rule__OntoUMLClass__Group_5__0 )? )
            {
            // InternalOntoUML.g:635:1: ( ( rule__OntoUMLClass__Group_5__0 )? )
            // InternalOntoUML.g:636:2: ( rule__OntoUMLClass__Group_5__0 )?
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup_5()); 
            // InternalOntoUML.g:637:2: ( rule__OntoUMLClass__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoUML.g:637:3: rule__OntoUMLClass__Group_5__0
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
    // InternalOntoUML.g:646:1: rule__OntoUMLClass__Group_4__0 : rule__OntoUMLClass__Group_4__0__Impl rule__OntoUMLClass__Group_4__1 ;
    public final void rule__OntoUMLClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:650:1: ( rule__OntoUMLClass__Group_4__0__Impl rule__OntoUMLClass__Group_4__1 )
            // InternalOntoUML.g:651:2: rule__OntoUMLClass__Group_4__0__Impl rule__OntoUMLClass__Group_4__1
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
    // InternalOntoUML.g:658:1: rule__OntoUMLClass__Group_4__0__Impl : ( 'supers...' ) ;
    public final void rule__OntoUMLClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:662:1: ( ( 'supers...' ) )
            // InternalOntoUML.g:663:1: ( 'supers...' )
            {
            // InternalOntoUML.g:663:1: ( 'supers...' )
            // InternalOntoUML.g:664:2: 'supers...'
            {
             before(grammarAccess.getOntoUMLClassAccess().getSupersKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOntoUML.g:673:1: rule__OntoUMLClass__Group_4__1 : rule__OntoUMLClass__Group_4__1__Impl rule__OntoUMLClass__Group_4__2 ;
    public final void rule__OntoUMLClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:677:1: ( rule__OntoUMLClass__Group_4__1__Impl rule__OntoUMLClass__Group_4__2 )
            // InternalOntoUML.g:678:2: rule__OntoUMLClass__Group_4__1__Impl rule__OntoUMLClass__Group_4__2
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
    // InternalOntoUML.g:685:1: rule__OntoUMLClass__Group_4__1__Impl : ( '{' ) ;
    public final void rule__OntoUMLClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:689:1: ( ( '{' ) )
            // InternalOntoUML.g:690:1: ( '{' )
            {
            // InternalOntoUML.g:690:1: ( '{' )
            // InternalOntoUML.g:691:2: '{'
            {
             before(grammarAccess.getOntoUMLClassAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalOntoUML.g:700:1: rule__OntoUMLClass__Group_4__2 : rule__OntoUMLClass__Group_4__2__Impl rule__OntoUMLClass__Group_4__3 ;
    public final void rule__OntoUMLClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:704:1: ( rule__OntoUMLClass__Group_4__2__Impl rule__OntoUMLClass__Group_4__3 )
            // InternalOntoUML.g:705:2: rule__OntoUMLClass__Group_4__2__Impl rule__OntoUMLClass__Group_4__3
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
    // InternalOntoUML.g:712:1: rule__OntoUMLClass__Group_4__2__Impl : ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 ) ) ;
    public final void rule__OntoUMLClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:716:1: ( ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 ) ) )
            // InternalOntoUML.g:717:1: ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 ) )
            {
            // InternalOntoUML.g:717:1: ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 ) )
            // InternalOntoUML.g:718:2: ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesAssignment_4_2()); 
            // InternalOntoUML.g:719:2: ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 )
            // InternalOntoUML.g:719:3: rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2
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
    // InternalOntoUML.g:727:1: rule__OntoUMLClass__Group_4__3 : rule__OntoUMLClass__Group_4__3__Impl rule__OntoUMLClass__Group_4__4 ;
    public final void rule__OntoUMLClass__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:731:1: ( rule__OntoUMLClass__Group_4__3__Impl rule__OntoUMLClass__Group_4__4 )
            // InternalOntoUML.g:732:2: rule__OntoUMLClass__Group_4__3__Impl rule__OntoUMLClass__Group_4__4
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
    // InternalOntoUML.g:739:1: rule__OntoUMLClass__Group_4__3__Impl : ( ( rule__OntoUMLClass__Group_4_3__0 )* ) ;
    public final void rule__OntoUMLClass__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:743:1: ( ( ( rule__OntoUMLClass__Group_4_3__0 )* ) )
            // InternalOntoUML.g:744:1: ( ( rule__OntoUMLClass__Group_4_3__0 )* )
            {
            // InternalOntoUML.g:744:1: ( ( rule__OntoUMLClass__Group_4_3__0 )* )
            // InternalOntoUML.g:745:2: ( rule__OntoUMLClass__Group_4_3__0 )*
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup_4_3()); 
            // InternalOntoUML.g:746:2: ( rule__OntoUMLClass__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOntoUML.g:746:3: rule__OntoUMLClass__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__OntoUMLClass__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalOntoUML.g:754:1: rule__OntoUMLClass__Group_4__4 : rule__OntoUMLClass__Group_4__4__Impl ;
    public final void rule__OntoUMLClass__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:758:1: ( rule__OntoUMLClass__Group_4__4__Impl )
            // InternalOntoUML.g:759:2: rule__OntoUMLClass__Group_4__4__Impl
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
    // InternalOntoUML.g:765:1: rule__OntoUMLClass__Group_4__4__Impl : ( '}' ) ;
    public final void rule__OntoUMLClass__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:769:1: ( ( '}' ) )
            // InternalOntoUML.g:770:1: ( '}' )
            {
            // InternalOntoUML.g:770:1: ( '}' )
            // InternalOntoUML.g:771:2: '}'
            {
             before(grammarAccess.getOntoUMLClassAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalOntoUML.g:781:1: rule__OntoUMLClass__Group_4_3__0 : rule__OntoUMLClass__Group_4_3__0__Impl rule__OntoUMLClass__Group_4_3__1 ;
    public final void rule__OntoUMLClass__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:785:1: ( rule__OntoUMLClass__Group_4_3__0__Impl rule__OntoUMLClass__Group_4_3__1 )
            // InternalOntoUML.g:786:2: rule__OntoUMLClass__Group_4_3__0__Impl rule__OntoUMLClass__Group_4_3__1
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
    // InternalOntoUML.g:793:1: rule__OntoUMLClass__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__OntoUMLClass__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:797:1: ( ( ',' ) )
            // InternalOntoUML.g:798:1: ( ',' )
            {
            // InternalOntoUML.g:798:1: ( ',' )
            // InternalOntoUML.g:799:2: ','
            {
             before(grammarAccess.getOntoUMLClassAccess().getCommaKeyword_4_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOntoUML.g:808:1: rule__OntoUMLClass__Group_4_3__1 : rule__OntoUMLClass__Group_4_3__1__Impl ;
    public final void rule__OntoUMLClass__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:812:1: ( rule__OntoUMLClass__Group_4_3__1__Impl )
            // InternalOntoUML.g:813:2: rule__OntoUMLClass__Group_4_3__1__Impl
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
    // InternalOntoUML.g:819:1: rule__OntoUMLClass__Group_4_3__1__Impl : ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 ) ) ;
    public final void rule__OntoUMLClass__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:823:1: ( ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 ) ) )
            // InternalOntoUML.g:824:1: ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 ) )
            {
            // InternalOntoUML.g:824:1: ( ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 ) )
            // InternalOntoUML.g:825:2: ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesAssignment_4_3_1()); 
            // InternalOntoUML.g:826:2: ( rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 )
            // InternalOntoUML.g:826:3: rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1
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
    // InternalOntoUML.g:835:1: rule__OntoUMLClass__Group_5__0 : rule__OntoUMLClass__Group_5__0__Impl rule__OntoUMLClass__Group_5__1 ;
    public final void rule__OntoUMLClass__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:839:1: ( rule__OntoUMLClass__Group_5__0__Impl rule__OntoUMLClass__Group_5__1 )
            // InternalOntoUML.g:840:2: rule__OntoUMLClass__Group_5__0__Impl rule__OntoUMLClass__Group_5__1
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
    // InternalOntoUML.g:847:1: rule__OntoUMLClass__Group_5__0__Impl : ( 'subs...' ) ;
    public final void rule__OntoUMLClass__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:851:1: ( ( 'subs...' ) )
            // InternalOntoUML.g:852:1: ( 'subs...' )
            {
            // InternalOntoUML.g:852:1: ( 'subs...' )
            // InternalOntoUML.g:853:2: 'subs...'
            {
             before(grammarAccess.getOntoUMLClassAccess().getSubsKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOntoUML.g:862:1: rule__OntoUMLClass__Group_5__1 : rule__OntoUMLClass__Group_5__1__Impl rule__OntoUMLClass__Group_5__2 ;
    public final void rule__OntoUMLClass__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:866:1: ( rule__OntoUMLClass__Group_5__1__Impl rule__OntoUMLClass__Group_5__2 )
            // InternalOntoUML.g:867:2: rule__OntoUMLClass__Group_5__1__Impl rule__OntoUMLClass__Group_5__2
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
    // InternalOntoUML.g:874:1: rule__OntoUMLClass__Group_5__1__Impl : ( '{' ) ;
    public final void rule__OntoUMLClass__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:878:1: ( ( '{' ) )
            // InternalOntoUML.g:879:1: ( '{' )
            {
            // InternalOntoUML.g:879:1: ( '{' )
            // InternalOntoUML.g:880:2: '{'
            {
             before(grammarAccess.getOntoUMLClassAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalOntoUML.g:889:1: rule__OntoUMLClass__Group_5__2 : rule__OntoUMLClass__Group_5__2__Impl rule__OntoUMLClass__Group_5__3 ;
    public final void rule__OntoUMLClass__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:893:1: ( rule__OntoUMLClass__Group_5__2__Impl rule__OntoUMLClass__Group_5__3 )
            // InternalOntoUML.g:894:2: rule__OntoUMLClass__Group_5__2__Impl rule__OntoUMLClass__Group_5__3
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
    // InternalOntoUML.g:901:1: rule__OntoUMLClass__Group_5__2__Impl : ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 ) ) ;
    public final void rule__OntoUMLClass__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:905:1: ( ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 ) ) )
            // InternalOntoUML.g:906:1: ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 ) )
            {
            // InternalOntoUML.g:906:1: ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 ) )
            // InternalOntoUML.g:907:2: ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesAssignment_5_2()); 
            // InternalOntoUML.g:908:2: ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 )
            // InternalOntoUML.g:908:3: rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2
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
    // InternalOntoUML.g:916:1: rule__OntoUMLClass__Group_5__3 : rule__OntoUMLClass__Group_5__3__Impl rule__OntoUMLClass__Group_5__4 ;
    public final void rule__OntoUMLClass__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:920:1: ( rule__OntoUMLClass__Group_5__3__Impl rule__OntoUMLClass__Group_5__4 )
            // InternalOntoUML.g:921:2: rule__OntoUMLClass__Group_5__3__Impl rule__OntoUMLClass__Group_5__4
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
    // InternalOntoUML.g:928:1: rule__OntoUMLClass__Group_5__3__Impl : ( ( rule__OntoUMLClass__Group_5_3__0 )* ) ;
    public final void rule__OntoUMLClass__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:932:1: ( ( ( rule__OntoUMLClass__Group_5_3__0 )* ) )
            // InternalOntoUML.g:933:1: ( ( rule__OntoUMLClass__Group_5_3__0 )* )
            {
            // InternalOntoUML.g:933:1: ( ( rule__OntoUMLClass__Group_5_3__0 )* )
            // InternalOntoUML.g:934:2: ( rule__OntoUMLClass__Group_5_3__0 )*
            {
             before(grammarAccess.getOntoUMLClassAccess().getGroup_5_3()); 
            // InternalOntoUML.g:935:2: ( rule__OntoUMLClass__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOntoUML.g:935:3: rule__OntoUMLClass__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__OntoUMLClass__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalOntoUML.g:943:1: rule__OntoUMLClass__Group_5__4 : rule__OntoUMLClass__Group_5__4__Impl ;
    public final void rule__OntoUMLClass__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:947:1: ( rule__OntoUMLClass__Group_5__4__Impl )
            // InternalOntoUML.g:948:2: rule__OntoUMLClass__Group_5__4__Impl
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
    // InternalOntoUML.g:954:1: rule__OntoUMLClass__Group_5__4__Impl : ( '}' ) ;
    public final void rule__OntoUMLClass__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:958:1: ( ( '}' ) )
            // InternalOntoUML.g:959:1: ( '}' )
            {
            // InternalOntoUML.g:959:1: ( '}' )
            // InternalOntoUML.g:960:2: '}'
            {
             before(grammarAccess.getOntoUMLClassAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalOntoUML.g:970:1: rule__OntoUMLClass__Group_5_3__0 : rule__OntoUMLClass__Group_5_3__0__Impl rule__OntoUMLClass__Group_5_3__1 ;
    public final void rule__OntoUMLClass__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:974:1: ( rule__OntoUMLClass__Group_5_3__0__Impl rule__OntoUMLClass__Group_5_3__1 )
            // InternalOntoUML.g:975:2: rule__OntoUMLClass__Group_5_3__0__Impl rule__OntoUMLClass__Group_5_3__1
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
    // InternalOntoUML.g:982:1: rule__OntoUMLClass__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__OntoUMLClass__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:986:1: ( ( ',' ) )
            // InternalOntoUML.g:987:1: ( ',' )
            {
            // InternalOntoUML.g:987:1: ( ',' )
            // InternalOntoUML.g:988:2: ','
            {
             before(grammarAccess.getOntoUMLClassAccess().getCommaKeyword_5_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOntoUML.g:997:1: rule__OntoUMLClass__Group_5_3__1 : rule__OntoUMLClass__Group_5_3__1__Impl ;
    public final void rule__OntoUMLClass__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1001:1: ( rule__OntoUMLClass__Group_5_3__1__Impl )
            // InternalOntoUML.g:1002:2: rule__OntoUMLClass__Group_5_3__1__Impl
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
    // InternalOntoUML.g:1008:1: rule__OntoUMLClass__Group_5_3__1__Impl : ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 ) ) ;
    public final void rule__OntoUMLClass__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1012:1: ( ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 ) ) )
            // InternalOntoUML.g:1013:1: ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 ) )
            {
            // InternalOntoUML.g:1013:1: ( ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 ) )
            // InternalOntoUML.g:1014:2: ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesAssignment_5_3_1()); 
            // InternalOntoUML.g:1015:2: ( rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 )
            // InternalOntoUML.g:1015:3: rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1
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
    // InternalOntoUML.g:1024:1: rule__Generalization__Group__0 : rule__Generalization__Group__0__Impl rule__Generalization__Group__1 ;
    public final void rule__Generalization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1028:1: ( rule__Generalization__Group__0__Impl rule__Generalization__Group__1 )
            // InternalOntoUML.g:1029:2: rule__Generalization__Group__0__Impl rule__Generalization__Group__1
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
    // InternalOntoUML.g:1036:1: rule__Generalization__Group__0__Impl : ( 'Generalization' ) ;
    public final void rule__Generalization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1040:1: ( ( 'Generalization' ) )
            // InternalOntoUML.g:1041:1: ( 'Generalization' )
            {
            // InternalOntoUML.g:1041:1: ( 'Generalization' )
            // InternalOntoUML.g:1042:2: 'Generalization'
            {
             before(grammarAccess.getGeneralizationAccess().getGeneralizationKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalOntoUML.g:1051:1: rule__Generalization__Group__1 : rule__Generalization__Group__1__Impl rule__Generalization__Group__2 ;
    public final void rule__Generalization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1055:1: ( rule__Generalization__Group__1__Impl rule__Generalization__Group__2 )
            // InternalOntoUML.g:1056:2: rule__Generalization__Group__1__Impl rule__Generalization__Group__2
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
    // InternalOntoUML.g:1063:1: rule__Generalization__Group__1__Impl : ( ( rule__Generalization__NameAssignment_1 ) ) ;
    public final void rule__Generalization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1067:1: ( ( ( rule__Generalization__NameAssignment_1 ) ) )
            // InternalOntoUML.g:1068:1: ( ( rule__Generalization__NameAssignment_1 ) )
            {
            // InternalOntoUML.g:1068:1: ( ( rule__Generalization__NameAssignment_1 ) )
            // InternalOntoUML.g:1069:2: ( rule__Generalization__NameAssignment_1 )
            {
             before(grammarAccess.getGeneralizationAccess().getNameAssignment_1()); 
            // InternalOntoUML.g:1070:2: ( rule__Generalization__NameAssignment_1 )
            // InternalOntoUML.g:1070:3: rule__Generalization__NameAssignment_1
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
    // InternalOntoUML.g:1078:1: rule__Generalization__Group__2 : rule__Generalization__Group__2__Impl rule__Generalization__Group__3 ;
    public final void rule__Generalization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1082:1: ( rule__Generalization__Group__2__Impl rule__Generalization__Group__3 )
            // InternalOntoUML.g:1083:2: rule__Generalization__Group__2__Impl rule__Generalization__Group__3
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
    // InternalOntoUML.g:1090:1: rule__Generalization__Group__2__Impl : ( ( rule__Generalization__AliasAssignment_2 )? ) ;
    public final void rule__Generalization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1094:1: ( ( ( rule__Generalization__AliasAssignment_2 )? ) )
            // InternalOntoUML.g:1095:1: ( ( rule__Generalization__AliasAssignment_2 )? )
            {
            // InternalOntoUML.g:1095:1: ( ( rule__Generalization__AliasAssignment_2 )? )
            // InternalOntoUML.g:1096:2: ( rule__Generalization__AliasAssignment_2 )?
            {
             before(grammarAccess.getGeneralizationAccess().getAliasAssignment_2()); 
            // InternalOntoUML.g:1097:2: ( rule__Generalization__AliasAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUML.g:1097:3: rule__Generalization__AliasAssignment_2
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
    // InternalOntoUML.g:1105:1: rule__Generalization__Group__3 : rule__Generalization__Group__3__Impl rule__Generalization__Group__4 ;
    public final void rule__Generalization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1109:1: ( rule__Generalization__Group__3__Impl rule__Generalization__Group__4 )
            // InternalOntoUML.g:1110:2: rule__Generalization__Group__3__Impl rule__Generalization__Group__4
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
    // InternalOntoUML.g:1117:1: rule__Generalization__Group__3__Impl : ( 'superclass' ) ;
    public final void rule__Generalization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1121:1: ( ( 'superclass' ) )
            // InternalOntoUML.g:1122:1: ( 'superclass' )
            {
            // InternalOntoUML.g:1122:1: ( 'superclass' )
            // InternalOntoUML.g:1123:2: 'superclass'
            {
             before(grammarAccess.getGeneralizationAccess().getSuperclassKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalOntoUML.g:1132:1: rule__Generalization__Group__4 : rule__Generalization__Group__4__Impl rule__Generalization__Group__5 ;
    public final void rule__Generalization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1136:1: ( rule__Generalization__Group__4__Impl rule__Generalization__Group__5 )
            // InternalOntoUML.g:1137:2: rule__Generalization__Group__4__Impl rule__Generalization__Group__5
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
    // InternalOntoUML.g:1144:1: rule__Generalization__Group__4__Impl : ( ( rule__Generalization__SuperclassAssignment_4 ) ) ;
    public final void rule__Generalization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1148:1: ( ( ( rule__Generalization__SuperclassAssignment_4 ) ) )
            // InternalOntoUML.g:1149:1: ( ( rule__Generalization__SuperclassAssignment_4 ) )
            {
            // InternalOntoUML.g:1149:1: ( ( rule__Generalization__SuperclassAssignment_4 ) )
            // InternalOntoUML.g:1150:2: ( rule__Generalization__SuperclassAssignment_4 )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperclassAssignment_4()); 
            // InternalOntoUML.g:1151:2: ( rule__Generalization__SuperclassAssignment_4 )
            // InternalOntoUML.g:1151:3: rule__Generalization__SuperclassAssignment_4
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
    // InternalOntoUML.g:1159:1: rule__Generalization__Group__5 : rule__Generalization__Group__5__Impl rule__Generalization__Group__6 ;
    public final void rule__Generalization__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1163:1: ( rule__Generalization__Group__5__Impl rule__Generalization__Group__6 )
            // InternalOntoUML.g:1164:2: rule__Generalization__Group__5__Impl rule__Generalization__Group__6
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
    // InternalOntoUML.g:1171:1: rule__Generalization__Group__5__Impl : ( 'subclass' ) ;
    public final void rule__Generalization__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1175:1: ( ( 'subclass' ) )
            // InternalOntoUML.g:1176:1: ( 'subclass' )
            {
            // InternalOntoUML.g:1176:1: ( 'subclass' )
            // InternalOntoUML.g:1177:2: 'subclass'
            {
             before(grammarAccess.getGeneralizationAccess().getSubclassKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalOntoUML.g:1186:1: rule__Generalization__Group__6 : rule__Generalization__Group__6__Impl ;
    public final void rule__Generalization__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1190:1: ( rule__Generalization__Group__6__Impl )
            // InternalOntoUML.g:1191:2: rule__Generalization__Group__6__Impl
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
    // InternalOntoUML.g:1197:1: rule__Generalization__Group__6__Impl : ( ( rule__Generalization__SubclassAssignment_6 ) ) ;
    public final void rule__Generalization__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1201:1: ( ( ( rule__Generalization__SubclassAssignment_6 ) ) )
            // InternalOntoUML.g:1202:1: ( ( rule__Generalization__SubclassAssignment_6 ) )
            {
            // InternalOntoUML.g:1202:1: ( ( rule__Generalization__SubclassAssignment_6 ) )
            // InternalOntoUML.g:1203:2: ( rule__Generalization__SubclassAssignment_6 )
            {
             before(grammarAccess.getGeneralizationAccess().getSubclassAssignment_6()); 
            // InternalOntoUML.g:1204:2: ( rule__Generalization__SubclassAssignment_6 )
            // InternalOntoUML.g:1204:3: rule__Generalization__SubclassAssignment_6
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
    // InternalOntoUML.g:1213:1: rule__GeneralizationSet__Group__0 : rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 ;
    public final void rule__GeneralizationSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1217:1: ( rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1 )
            // InternalOntoUML.g:1218:2: rule__GeneralizationSet__Group__0__Impl rule__GeneralizationSet__Group__1
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
    // InternalOntoUML.g:1225:1: rule__GeneralizationSet__Group__0__Impl : ( ( rule__GeneralizationSet__IsDisjointAssignment_0 ) ) ;
    public final void rule__GeneralizationSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1229:1: ( ( ( rule__GeneralizationSet__IsDisjointAssignment_0 ) ) )
            // InternalOntoUML.g:1230:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0 ) )
            {
            // InternalOntoUML.g:1230:1: ( ( rule__GeneralizationSet__IsDisjointAssignment_0 ) )
            // InternalOntoUML.g:1231:2: ( rule__GeneralizationSet__IsDisjointAssignment_0 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointAssignment_0()); 
            // InternalOntoUML.g:1232:2: ( rule__GeneralizationSet__IsDisjointAssignment_0 )
            // InternalOntoUML.g:1232:3: rule__GeneralizationSet__IsDisjointAssignment_0
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
    // InternalOntoUML.g:1240:1: rule__GeneralizationSet__Group__1 : rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 ;
    public final void rule__GeneralizationSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1244:1: ( rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2 )
            // InternalOntoUML.g:1245:2: rule__GeneralizationSet__Group__1__Impl rule__GeneralizationSet__Group__2
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
    // InternalOntoUML.g:1252:1: rule__GeneralizationSet__Group__1__Impl : ( ( rule__GeneralizationSet__IsCompleteAssignment_1 ) ) ;
    public final void rule__GeneralizationSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1256:1: ( ( ( rule__GeneralizationSet__IsCompleteAssignment_1 ) ) )
            // InternalOntoUML.g:1257:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_1 ) )
            {
            // InternalOntoUML.g:1257:1: ( ( rule__GeneralizationSet__IsCompleteAssignment_1 ) )
            // InternalOntoUML.g:1258:2: ( rule__GeneralizationSet__IsCompleteAssignment_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteAssignment_1()); 
            // InternalOntoUML.g:1259:2: ( rule__GeneralizationSet__IsCompleteAssignment_1 )
            // InternalOntoUML.g:1259:3: rule__GeneralizationSet__IsCompleteAssignment_1
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
    // InternalOntoUML.g:1267:1: rule__GeneralizationSet__Group__2 : rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 ;
    public final void rule__GeneralizationSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1271:1: ( rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3 )
            // InternalOntoUML.g:1272:2: rule__GeneralizationSet__Group__2__Impl rule__GeneralizationSet__Group__3
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
    // InternalOntoUML.g:1279:1: rule__GeneralizationSet__Group__2__Impl : ( 'GeneralizationSet' ) ;
    public final void rule__GeneralizationSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1283:1: ( ( 'GeneralizationSet' ) )
            // InternalOntoUML.g:1284:1: ( 'GeneralizationSet' )
            {
            // InternalOntoUML.g:1284:1: ( 'GeneralizationSet' )
            // InternalOntoUML.g:1285:2: 'GeneralizationSet'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationSetKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalOntoUML.g:1294:1: rule__GeneralizationSet__Group__3 : rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 ;
    public final void rule__GeneralizationSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1298:1: ( rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4 )
            // InternalOntoUML.g:1299:2: rule__GeneralizationSet__Group__3__Impl rule__GeneralizationSet__Group__4
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
    // InternalOntoUML.g:1306:1: rule__GeneralizationSet__Group__3__Impl : ( ( rule__GeneralizationSet__NameAssignment_3 ) ) ;
    public final void rule__GeneralizationSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1310:1: ( ( ( rule__GeneralizationSet__NameAssignment_3 ) ) )
            // InternalOntoUML.g:1311:1: ( ( rule__GeneralizationSet__NameAssignment_3 ) )
            {
            // InternalOntoUML.g:1311:1: ( ( rule__GeneralizationSet__NameAssignment_3 ) )
            // InternalOntoUML.g:1312:2: ( rule__GeneralizationSet__NameAssignment_3 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getNameAssignment_3()); 
            // InternalOntoUML.g:1313:2: ( rule__GeneralizationSet__NameAssignment_3 )
            // InternalOntoUML.g:1313:3: rule__GeneralizationSet__NameAssignment_3
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
    // InternalOntoUML.g:1321:1: rule__GeneralizationSet__Group__4 : rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 ;
    public final void rule__GeneralizationSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1325:1: ( rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5 )
            // InternalOntoUML.g:1326:2: rule__GeneralizationSet__Group__4__Impl rule__GeneralizationSet__Group__5
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
    // InternalOntoUML.g:1333:1: rule__GeneralizationSet__Group__4__Impl : ( ( rule__GeneralizationSet__AliasAssignment_4 )? ) ;
    public final void rule__GeneralizationSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1337:1: ( ( ( rule__GeneralizationSet__AliasAssignment_4 )? ) )
            // InternalOntoUML.g:1338:1: ( ( rule__GeneralizationSet__AliasAssignment_4 )? )
            {
            // InternalOntoUML.g:1338:1: ( ( rule__GeneralizationSet__AliasAssignment_4 )? )
            // InternalOntoUML.g:1339:2: ( rule__GeneralizationSet__AliasAssignment_4 )?
            {
             before(grammarAccess.getGeneralizationSetAccess().getAliasAssignment_4()); 
            // InternalOntoUML.g:1340:2: ( rule__GeneralizationSet__AliasAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOntoUML.g:1340:3: rule__GeneralizationSet__AliasAssignment_4
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
    // InternalOntoUML.g:1348:1: rule__GeneralizationSet__Group__5 : rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 ;
    public final void rule__GeneralizationSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1352:1: ( rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6 )
            // InternalOntoUML.g:1353:2: rule__GeneralizationSet__Group__5__Impl rule__GeneralizationSet__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalOntoUML.g:1360:1: rule__GeneralizationSet__Group__5__Impl : ( 'generalizations' ) ;
    public final void rule__GeneralizationSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1364:1: ( ( 'generalizations' ) )
            // InternalOntoUML.g:1365:1: ( 'generalizations' )
            {
            // InternalOntoUML.g:1365:1: ( 'generalizations' )
            // InternalOntoUML.g:1366:2: 'generalizations'
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalOntoUML.g:1375:1: rule__GeneralizationSet__Group__6 : rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 ;
    public final void rule__GeneralizationSet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1379:1: ( rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7 )
            // InternalOntoUML.g:1380:2: rule__GeneralizationSet__Group__6__Impl rule__GeneralizationSet__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalOntoUML.g:1387:1: rule__GeneralizationSet__Group__6__Impl : ( '{' ) ;
    public final void rule__GeneralizationSet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1391:1: ( ( '{' ) )
            // InternalOntoUML.g:1392:1: ( '{' )
            {
            // InternalOntoUML.g:1392:1: ( '{' )
            // InternalOntoUML.g:1393:2: '{'
            {
             before(grammarAccess.getGeneralizationSetAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getLeftCurlyBracketKeyword_6()); 

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
    // InternalOntoUML.g:1402:1: rule__GeneralizationSet__Group__7 : rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 ;
    public final void rule__GeneralizationSet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1406:1: ( rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8 )
            // InternalOntoUML.g:1407:2: rule__GeneralizationSet__Group__7__Impl rule__GeneralizationSet__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__GeneralizationSet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__8();

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
    // InternalOntoUML.g:1414:1: rule__GeneralizationSet__Group__7__Impl : ( ( rule__GeneralizationSet__GeneralizationsAssignment_7 ) ) ;
    public final void rule__GeneralizationSet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1418:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_7 ) ) )
            // InternalOntoUML.g:1419:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_7 ) )
            {
            // InternalOntoUML.g:1419:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_7 ) )
            // InternalOntoUML.g:1420:2: ( rule__GeneralizationSet__GeneralizationsAssignment_7 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_7()); 
            // InternalOntoUML.g:1421:2: ( rule__GeneralizationSet__GeneralizationsAssignment_7 )
            // InternalOntoUML.g:1421:3: rule__GeneralizationSet__GeneralizationsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__GeneralizationsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_7()); 

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


    // $ANTLR start "rule__GeneralizationSet__Group__8"
    // InternalOntoUML.g:1429:1: rule__GeneralizationSet__Group__8 : rule__GeneralizationSet__Group__8__Impl rule__GeneralizationSet__Group__9 ;
    public final void rule__GeneralizationSet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1433:1: ( rule__GeneralizationSet__Group__8__Impl rule__GeneralizationSet__Group__9 )
            // InternalOntoUML.g:1434:2: rule__GeneralizationSet__Group__8__Impl rule__GeneralizationSet__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__GeneralizationSet__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__9();

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
    // $ANTLR end "rule__GeneralizationSet__Group__8"


    // $ANTLR start "rule__GeneralizationSet__Group__8__Impl"
    // InternalOntoUML.g:1441:1: rule__GeneralizationSet__Group__8__Impl : ( ( rule__GeneralizationSet__Group_8__0 )* ) ;
    public final void rule__GeneralizationSet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1445:1: ( ( ( rule__GeneralizationSet__Group_8__0 )* ) )
            // InternalOntoUML.g:1446:1: ( ( rule__GeneralizationSet__Group_8__0 )* )
            {
            // InternalOntoUML.g:1446:1: ( ( rule__GeneralizationSet__Group_8__0 )* )
            // InternalOntoUML.g:1447:2: ( rule__GeneralizationSet__Group_8__0 )*
            {
             before(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 
            // InternalOntoUML.g:1448:2: ( rule__GeneralizationSet__Group_8__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOntoUML.g:1448:3: rule__GeneralizationSet__Group_8__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GeneralizationSet__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGeneralizationSetAccess().getGroup_8()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group__8__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group__9"
    // InternalOntoUML.g:1456:1: rule__GeneralizationSet__Group__9 : rule__GeneralizationSet__Group__9__Impl ;
    public final void rule__GeneralizationSet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1460:1: ( rule__GeneralizationSet__Group__9__Impl )
            // InternalOntoUML.g:1461:2: rule__GeneralizationSet__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group__9__Impl();

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
    // $ANTLR end "rule__GeneralizationSet__Group__9"


    // $ANTLR start "rule__GeneralizationSet__Group__9__Impl"
    // InternalOntoUML.g:1467:1: rule__GeneralizationSet__Group__9__Impl : ( '}' ) ;
    public final void rule__GeneralizationSet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1471:1: ( ( '}' ) )
            // InternalOntoUML.g:1472:1: ( '}' )
            {
            // InternalOntoUML.g:1472:1: ( '}' )
            // InternalOntoUML.g:1473:2: '}'
            {
             before(grammarAccess.getGeneralizationSetAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group__9__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_8__0"
    // InternalOntoUML.g:1483:1: rule__GeneralizationSet__Group_8__0 : rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 ;
    public final void rule__GeneralizationSet__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1487:1: ( rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1 )
            // InternalOntoUML.g:1488:2: rule__GeneralizationSet__Group_8__0__Impl rule__GeneralizationSet__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__GeneralizationSet__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_8__1();

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
    // $ANTLR end "rule__GeneralizationSet__Group_8__0"


    // $ANTLR start "rule__GeneralizationSet__Group_8__0__Impl"
    // InternalOntoUML.g:1495:1: rule__GeneralizationSet__Group_8__0__Impl : ( ',' ) ;
    public final void rule__GeneralizationSet__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1499:1: ( ( ',' ) )
            // InternalOntoUML.g:1500:1: ( ',' )
            {
            // InternalOntoUML.g:1500:1: ( ',' )
            // InternalOntoUML.g:1501:2: ','
            {
             before(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group_8__0__Impl"


    // $ANTLR start "rule__GeneralizationSet__Group_8__1"
    // InternalOntoUML.g:1510:1: rule__GeneralizationSet__Group_8__1 : rule__GeneralizationSet__Group_8__1__Impl ;
    public final void rule__GeneralizationSet__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1514:1: ( rule__GeneralizationSet__Group_8__1__Impl )
            // InternalOntoUML.g:1515:2: rule__GeneralizationSet__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__Group_8__1__Impl();

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
    // $ANTLR end "rule__GeneralizationSet__Group_8__1"


    // $ANTLR start "rule__GeneralizationSet__Group_8__1__Impl"
    // InternalOntoUML.g:1521:1: rule__GeneralizationSet__Group_8__1__Impl : ( ( rule__GeneralizationSet__GeneralizationsAssignment_8_1 ) ) ;
    public final void rule__GeneralizationSet__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1525:1: ( ( ( rule__GeneralizationSet__GeneralizationsAssignment_8_1 ) ) )
            // InternalOntoUML.g:1526:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_8_1 ) )
            {
            // InternalOntoUML.g:1526:1: ( ( rule__GeneralizationSet__GeneralizationsAssignment_8_1 ) )
            // InternalOntoUML.g:1527:2: ( rule__GeneralizationSet__GeneralizationsAssignment_8_1 )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_8_1()); 
            // InternalOntoUML.g:1528:2: ( rule__GeneralizationSet__GeneralizationsAssignment_8_1 )
            // InternalOntoUML.g:1528:3: rule__GeneralizationSet__GeneralizationsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__GeneralizationSet__GeneralizationsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsAssignment_8_1()); 

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
    // $ANTLR end "rule__GeneralizationSet__Group_8__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_2"
    // InternalOntoUML.g:1537:1: rule__Model__ElementsAssignment_2 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1541:1: ( ( ruleModelElement ) )
            // InternalOntoUML.g:1542:2: ( ruleModelElement )
            {
            // InternalOntoUML.g:1542:2: ( ruleModelElement )
            // InternalOntoUML.g:1543:3: ruleModelElement
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
    // InternalOntoUML.g:1552:1: rule__Model__ElementsAssignment_3_1 : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1556:1: ( ( ruleModelElement ) )
            // InternalOntoUML.g:1557:2: ( ruleModelElement )
            {
            // InternalOntoUML.g:1557:2: ( ruleModelElement )
            // InternalOntoUML.g:1558:3: ruleModelElement
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
    // InternalOntoUML.g:1567:1: rule__OntoUMLClass___typeAssignment_0 : ( ruleEndurantType ) ;
    public final void rule__OntoUMLClass___typeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1571:1: ( ( ruleEndurantType ) )
            // InternalOntoUML.g:1572:2: ( ruleEndurantType )
            {
            // InternalOntoUML.g:1572:2: ( ruleEndurantType )
            // InternalOntoUML.g:1573:3: ruleEndurantType
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
    // InternalOntoUML.g:1582:1: rule__OntoUMLClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OntoUMLClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1586:1: ( ( RULE_ID ) )
            // InternalOntoUML.g:1587:2: ( RULE_ID )
            {
            // InternalOntoUML.g:1587:2: ( RULE_ID )
            // InternalOntoUML.g:1588:3: RULE_ID
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
    // InternalOntoUML.g:1597:1: rule__OntoUMLClass__AliasAssignment_3 : ( RULE_STRING ) ;
    public final void rule__OntoUMLClass__AliasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1601:1: ( ( RULE_STRING ) )
            // InternalOntoUML.g:1602:2: ( RULE_STRING )
            {
            // InternalOntoUML.g:1602:2: ( RULE_STRING )
            // InternalOntoUML.g:1603:3: RULE_STRING
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
    // InternalOntoUML.g:1612:1: rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1616:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1617:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1617:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1618:3: ( RULE_ID )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesGeneralizationCrossReference_4_2_0()); 
            // InternalOntoUML.g:1619:3: ( RULE_ID )
            // InternalOntoUML.g:1620:4: RULE_ID
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
    // InternalOntoUML.g:1631:1: rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__OntoUMLClass__GeneralizationsToSuperclassesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1635:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1636:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1636:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1637:3: ( RULE_ID )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesGeneralizationCrossReference_4_3_1_0()); 
            // InternalOntoUML.g:1638:3: ( RULE_ID )
            // InternalOntoUML.g:1639:4: RULE_ID
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
    // InternalOntoUML.g:1650:1: rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1654:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1655:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1655:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1656:3: ( RULE_ID )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesGeneralizationCrossReference_5_2_0()); 
            // InternalOntoUML.g:1657:3: ( RULE_ID )
            // InternalOntoUML.g:1658:4: RULE_ID
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
    // InternalOntoUML.g:1669:1: rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__OntoUMLClass__GeneralizationsToSubclassesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1673:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1674:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1674:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1675:3: ( RULE_ID )
            {
             before(grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesGeneralizationCrossReference_5_3_1_0()); 
            // InternalOntoUML.g:1676:3: ( RULE_ID )
            // InternalOntoUML.g:1677:4: RULE_ID
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
    // InternalOntoUML.g:1688:1: rule__Generalization__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Generalization__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1692:1: ( ( RULE_ID ) )
            // InternalOntoUML.g:1693:2: ( RULE_ID )
            {
            // InternalOntoUML.g:1693:2: ( RULE_ID )
            // InternalOntoUML.g:1694:3: RULE_ID
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
    // InternalOntoUML.g:1703:1: rule__Generalization__AliasAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Generalization__AliasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1707:1: ( ( RULE_STRING ) )
            // InternalOntoUML.g:1708:2: ( RULE_STRING )
            {
            // InternalOntoUML.g:1708:2: ( RULE_STRING )
            // InternalOntoUML.g:1709:3: RULE_STRING
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
    // InternalOntoUML.g:1718:1: rule__Generalization__SuperclassAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Generalization__SuperclassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1722:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1723:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1723:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1724:3: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizationAccess().getSuperclassOntoUMLClassCrossReference_4_0()); 
            // InternalOntoUML.g:1725:3: ( RULE_ID )
            // InternalOntoUML.g:1726:4: RULE_ID
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
    // InternalOntoUML.g:1737:1: rule__Generalization__SubclassAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Generalization__SubclassAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1741:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1742:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1742:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1743:3: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizationAccess().getSubclassOntoUMLClassCrossReference_6_0()); 
            // InternalOntoUML.g:1744:3: ( RULE_ID )
            // InternalOntoUML.g:1745:4: RULE_ID
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
    // InternalOntoUML.g:1756:1: rule__GeneralizationSet__IsDisjointAssignment_0 : ( ( 'disjoint' ) ) ;
    public final void rule__GeneralizationSet__IsDisjointAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1760:1: ( ( ( 'disjoint' ) ) )
            // InternalOntoUML.g:1761:2: ( ( 'disjoint' ) )
            {
            // InternalOntoUML.g:1761:2: ( ( 'disjoint' ) )
            // InternalOntoUML.g:1762:3: ( 'disjoint' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0()); 
            // InternalOntoUML.g:1763:3: ( 'disjoint' )
            // InternalOntoUML.g:1764:4: 'disjoint'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOntoUML.g:1775:1: rule__GeneralizationSet__IsCompleteAssignment_1 : ( ( 'complete' ) ) ;
    public final void rule__GeneralizationSet__IsCompleteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1779:1: ( ( ( 'complete' ) ) )
            // InternalOntoUML.g:1780:2: ( ( 'complete' ) )
            {
            // InternalOntoUML.g:1780:2: ( ( 'complete' ) )
            // InternalOntoUML.g:1781:3: ( 'complete' )
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_0()); 
            // InternalOntoUML.g:1782:3: ( 'complete' )
            // InternalOntoUML.g:1783:4: 'complete'
            {
             before(grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalOntoUML.g:1794:1: rule__GeneralizationSet__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__GeneralizationSet__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1798:1: ( ( RULE_ID ) )
            // InternalOntoUML.g:1799:2: ( RULE_ID )
            {
            // InternalOntoUML.g:1799:2: ( RULE_ID )
            // InternalOntoUML.g:1800:3: RULE_ID
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
    // InternalOntoUML.g:1809:1: rule__GeneralizationSet__AliasAssignment_4 : ( RULE_STRING ) ;
    public final void rule__GeneralizationSet__AliasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1813:1: ( ( RULE_STRING ) )
            // InternalOntoUML.g:1814:2: ( RULE_STRING )
            {
            // InternalOntoUML.g:1814:2: ( RULE_STRING )
            // InternalOntoUML.g:1815:3: RULE_STRING
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


    // $ANTLR start "rule__GeneralizationSet__GeneralizationsAssignment_7"
    // InternalOntoUML.g:1824:1: rule__GeneralizationSet__GeneralizationsAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1828:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1829:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1829:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1830:3: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_7_0()); 
            // InternalOntoUML.g:1831:3: ( RULE_ID )
            // InternalOntoUML.g:1832:4: RULE_ID
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_7_0()); 

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
    // $ANTLR end "rule__GeneralizationSet__GeneralizationsAssignment_7"


    // $ANTLR start "rule__GeneralizationSet__GeneralizationsAssignment_8_1"
    // InternalOntoUML.g:1843:1: rule__GeneralizationSet__GeneralizationsAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__GeneralizationSet__GeneralizationsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOntoUML.g:1847:1: ( ( ( RULE_ID ) ) )
            // InternalOntoUML.g:1848:2: ( ( RULE_ID ) )
            {
            // InternalOntoUML.g:1848:2: ( ( RULE_ID ) )
            // InternalOntoUML.g:1849:3: ( RULE_ID )
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_8_1_0()); 
            // InternalOntoUML.g:1850:3: ( RULE_ID )
            // InternalOntoUML.g:1851:4: RULE_ID
            {
             before(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_8_1_0()); 

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
    // $ANTLR end "rule__GeneralizationSet__GeneralizationsAssignment_8_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000004243FF800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000043FF800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000018000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000020L});

}