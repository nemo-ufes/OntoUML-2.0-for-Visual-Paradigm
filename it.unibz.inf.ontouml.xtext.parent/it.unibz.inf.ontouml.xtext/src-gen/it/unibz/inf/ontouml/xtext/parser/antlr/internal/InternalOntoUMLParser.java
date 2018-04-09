package it.unibz.inf.ontouml.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.unibz.inf.ontouml.xtext.services.OntoUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntoUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "','", "'}'", "'.'", "'Package'", "'Class'", "'Generalization'", "'superclass'", "'subclass'", "'disjoint'", "'complete'", "'GeneralizationSet'", "'generalizations'", "'none'", "'kind'", "'relatorKind'", "'modeKind'", "'qualityKind'", "'subkind'", "'role'", "'phase'", "'category'", "'mixin'", "'roleMixin'", "'phaseMixin'"
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

        public InternalOntoUMLParser(TokenStream input, OntoUMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected OntoUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalOntoUML.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalOntoUML.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalOntoUML.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalOntoUML.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Model' otherlv_1= '{' ( (lv_elements_2_0= ruleModelElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleModelElement ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:78:2: ( (otherlv_0= 'Model' otherlv_1= '{' ( (lv_elements_2_0= ruleModelElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleModelElement ) ) )* otherlv_5= '}' ) )
            // InternalOntoUML.g:79:2: (otherlv_0= 'Model' otherlv_1= '{' ( (lv_elements_2_0= ruleModelElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleModelElement ) ) )* otherlv_5= '}' )
            {
            // InternalOntoUML.g:79:2: (otherlv_0= 'Model' otherlv_1= '{' ( (lv_elements_2_0= ruleModelElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleModelElement ) ) )* otherlv_5= '}' )
            // InternalOntoUML.g:80:3: otherlv_0= 'Model' otherlv_1= '{' ( (lv_elements_2_0= ruleModelElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleModelElement ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalOntoUML.g:88:3: ( (lv_elements_2_0= ruleModelElement ) )
            // InternalOntoUML.g:89:4: (lv_elements_2_0= ruleModelElement )
            {
            // InternalOntoUML.g:89:4: (lv_elements_2_0= ruleModelElement )
            // InternalOntoUML.g:90:5: lv_elements_2_0= ruleModelElement
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_elements_2_0=ruleModelElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_2_0,
            						"it.unibz.inf.ontouml.xtext.OntoUML.ModelElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUML.g:107:3: (otherlv_3= ',' ( (lv_elements_4_0= ruleModelElement ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOntoUML.g:108:4: otherlv_3= ',' ( (lv_elements_4_0= ruleModelElement ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalOntoUML.g:112:4: ( (lv_elements_4_0= ruleModelElement ) )
            	    // InternalOntoUML.g:113:5: (lv_elements_4_0= ruleModelElement )
            	    {
            	    // InternalOntoUML.g:113:5: (lv_elements_4_0= ruleModelElement )
            	    // InternalOntoUML.g:114:6: lv_elements_4_0= ruleModelElement
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_elements_4_0=ruleModelElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_4_0,
            	    							"it.unibz.inf.ontouml.xtext.OntoUML.ModelElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalOntoUML.g:140:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalOntoUML.g:140:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalOntoUML.g:141:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalOntoUML.g:147:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalOntoUML.g:153:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalOntoUML.g:154:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalOntoUML.g:154:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalOntoUML.g:155:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalOntoUML.g:162:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOntoUML.g:163:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleModelElement"
    // InternalOntoUML.g:180:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // InternalOntoUML.g:180:53: (iv_ruleModelElement= ruleModelElement EOF )
            // InternalOntoUML.g:181:2: iv_ruleModelElement= ruleModelElement EOF
            {
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalOntoUML.g:187:1: ruleModelElement returns [EObject current=null] : (this_Package_0= rulePackage | this_OntoUMLClass_1= ruleOntoUMLClass | this_Generalization_2= ruleGeneralization | this_GeneralizationSet_3= ruleGeneralizationSet ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_OntoUMLClass_1 = null;

        EObject this_Generalization_2 = null;

        EObject this_GeneralizationSet_3 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:193:2: ( (this_Package_0= rulePackage | this_OntoUMLClass_1= ruleOntoUMLClass | this_Generalization_2= ruleGeneralization | this_GeneralizationSet_3= ruleGeneralizationSet ) )
            // InternalOntoUML.g:194:2: (this_Package_0= rulePackage | this_OntoUMLClass_1= ruleOntoUMLClass | this_Generalization_2= ruleGeneralization | this_GeneralizationSet_3= ruleGeneralizationSet )
            {
            // InternalOntoUML.g:194:2: (this_Package_0= rulePackage | this_OntoUMLClass_1= ruleOntoUMLClass | this_Generalization_2= ruleGeneralization | this_GeneralizationSet_3= ruleGeneralizationSet )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOntoUML.g:195:3: this_Package_0= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getPackageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_0=rulePackage();

                    state._fsp--;


                    			current = this_Package_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:204:3: this_OntoUMLClass_1= ruleOntoUMLClass
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getOntoUMLClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntoUMLClass_1=ruleOntoUMLClass();

                    state._fsp--;


                    			current = this_OntoUMLClass_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:213:3: this_Generalization_2= ruleGeneralization
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getGeneralizationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generalization_2=ruleGeneralization();

                    state._fsp--;


                    			current = this_Generalization_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:222:3: this_GeneralizationSet_3= ruleGeneralizationSet
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneralizationSet_3=ruleGeneralizationSet();

                    state._fsp--;


                    			current = this_GeneralizationSet_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRulePackage"
    // InternalOntoUML.g:234:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalOntoUML.g:234:48: (iv_rulePackage= rulePackage EOF )
            // InternalOntoUML.g:235:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalOntoUML.g:241:1: rulePackage returns [EObject current=null] : (otherlv_0= 'Package' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_contents_4_0= ruleModelElement ) ) otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_contents_4_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:247:2: ( (otherlv_0= 'Package' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_contents_4_0= ruleModelElement ) ) otherlv_5= '}' ) )
            // InternalOntoUML.g:248:2: (otherlv_0= 'Package' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_contents_4_0= ruleModelElement ) ) otherlv_5= '}' )
            {
            // InternalOntoUML.g:248:2: (otherlv_0= 'Package' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_contents_4_0= ruleModelElement ) ) otherlv_5= '}' )
            // InternalOntoUML.g:249:3: otherlv_0= 'Package' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= '{' ( (lv_contents_4_0= ruleModelElement ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalOntoUML.g:253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntoUML.g:254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntoUML.g:254:4: (lv_name_1_0= RULE_ID )
            // InternalOntoUML.g:255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntoUML.g:271:3: ( (lv_alias_2_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoUML.g:272:4: (lv_alias_2_0= RULE_STRING )
                    {
                    // InternalOntoUML.g:272:4: (lv_alias_2_0= RULE_STRING )
                    // InternalOntoUML.g:273:5: lv_alias_2_0= RULE_STRING
                    {
                    lv_alias_2_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

                    					newLeafNode(lv_alias_2_0, grammarAccess.getPackageAccess().getAliasSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPackageRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"alias",
                    						lv_alias_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOntoUML.g:293:3: ( (lv_contents_4_0= ruleModelElement ) )
            // InternalOntoUML.g:294:4: (lv_contents_4_0= ruleModelElement )
            {
            // InternalOntoUML.g:294:4: (lv_contents_4_0= ruleModelElement )
            // InternalOntoUML.g:295:5: lv_contents_4_0= ruleModelElement
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getContentsModelElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_contents_4_0=ruleModelElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					add(
            						current,
            						"contents",
            						lv_contents_4_0,
            						"it.unibz.inf.ontouml.xtext.OntoUML.ModelElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleOntoUMLClass"
    // InternalOntoUML.g:320:1: entryRuleOntoUMLClass returns [EObject current=null] : iv_ruleOntoUMLClass= ruleOntoUMLClass EOF ;
    public final EObject entryRuleOntoUMLClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntoUMLClass = null;


        try {
            // InternalOntoUML.g:320:53: (iv_ruleOntoUMLClass= ruleOntoUMLClass EOF )
            // InternalOntoUML.g:321:2: iv_ruleOntoUMLClass= ruleOntoUMLClass EOF
            {
             newCompositeNode(grammarAccess.getOntoUMLClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOntoUMLClass=ruleOntoUMLClass();

            state._fsp--;

             current =iv_ruleOntoUMLClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOntoUMLClass"


    // $ANTLR start "ruleOntoUMLClass"
    // InternalOntoUML.g:327:1: ruleOntoUMLClass returns [EObject current=null] : ( ( (lv__type_0_0= ruleEndurantType ) ) otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleOntoUMLClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_alias_3_0=null;
        Enumerator lv__type_0_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:333:2: ( ( ( (lv__type_0_0= ruleEndurantType ) ) otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) )? ) )
            // InternalOntoUML.g:334:2: ( ( (lv__type_0_0= ruleEndurantType ) ) otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) )? )
            {
            // InternalOntoUML.g:334:2: ( ( (lv__type_0_0= ruleEndurantType ) ) otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) )? )
            // InternalOntoUML.g:335:3: ( (lv__type_0_0= ruleEndurantType ) ) otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) )?
            {
            // InternalOntoUML.g:335:3: ( (lv__type_0_0= ruleEndurantType ) )
            // InternalOntoUML.g:336:4: (lv__type_0_0= ruleEndurantType )
            {
            // InternalOntoUML.g:336:4: (lv__type_0_0= ruleEndurantType )
            // InternalOntoUML.g:337:5: lv__type_0_0= ruleEndurantType
            {

            					newCompositeNode(grammarAccess.getOntoUMLClassAccess().get_typeEndurantTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv__type_0_0=ruleEndurantType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOntoUMLClassRule());
            					}
            					set(
            						current,
            						"_type",
            						lv__type_0_0,
            						"it.unibz.inf.ontouml.xtext.OntoUML.EndurantType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntoUMLClassAccess().getClassKeyword_1());
            		
            // InternalOntoUML.g:358:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOntoUML.g:359:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOntoUML.g:359:4: (lv_name_2_0= RULE_ID )
            // InternalOntoUML.g:360:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOntoUMLClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOntoUMLClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntoUML.g:376:3: ( (lv_alias_3_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOntoUML.g:377:4: (lv_alias_3_0= RULE_STRING )
                    {
                    // InternalOntoUML.g:377:4: (lv_alias_3_0= RULE_STRING )
                    // InternalOntoUML.g:378:5: lv_alias_3_0= RULE_STRING
                    {
                    lv_alias_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_alias_3_0, grammarAccess.getOntoUMLClassAccess().getAliasSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOntoUMLClassRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"alias",
                    						lv_alias_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOntoUMLClass"


    // $ANTLR start "entryRuleGeneralization"
    // InternalOntoUML.g:398:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalOntoUML.g:398:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalOntoUML.g:399:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;

             current =iv_ruleGeneralization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // InternalOntoUML.g:405:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'Generalization' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= 'superclass' ( ( ruleQualifiedName ) ) otherlv_5= 'subclass' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalOntoUML.g:411:2: ( (otherlv_0= 'Generalization' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= 'superclass' ( ( ruleQualifiedName ) ) otherlv_5= 'subclass' ( ( ruleQualifiedName ) ) ) )
            // InternalOntoUML.g:412:2: (otherlv_0= 'Generalization' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= 'superclass' ( ( ruleQualifiedName ) ) otherlv_5= 'subclass' ( ( ruleQualifiedName ) ) )
            {
            // InternalOntoUML.g:412:2: (otherlv_0= 'Generalization' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= 'superclass' ( ( ruleQualifiedName ) ) otherlv_5= 'subclass' ( ( ruleQualifiedName ) ) )
            // InternalOntoUML.g:413:3: otherlv_0= 'Generalization' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= 'superclass' ( ( ruleQualifiedName ) ) otherlv_5= 'subclass' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGeneralizationKeyword_0());
            		
            // InternalOntoUML.g:417:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntoUML.g:418:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntoUML.g:418:4: (lv_name_1_0= RULE_ID )
            // InternalOntoUML.g:419:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGeneralizationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntoUML.g:435:3: ( (lv_alias_2_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoUML.g:436:4: (lv_alias_2_0= RULE_STRING )
                    {
                    // InternalOntoUML.g:436:4: (lv_alias_2_0= RULE_STRING )
                    // InternalOntoUML.g:437:5: lv_alias_2_0= RULE_STRING
                    {
                    lv_alias_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    					newLeafNode(lv_alias_2_0, grammarAccess.getGeneralizationAccess().getAliasSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGeneralizationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"alias",
                    						lv_alias_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getSuperclassKeyword_3());
            		
            // InternalOntoUML.g:457:3: ( ( ruleQualifiedName ) )
            // InternalOntoUML.g:458:4: ( ruleQualifiedName )
            {
            // InternalOntoUML.g:458:4: ( ruleQualifiedName )
            // InternalOntoUML.g:459:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getSuperclassOntoUMLClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_14);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneralizationAccess().getSubclassKeyword_5());
            		
            // InternalOntoUML.g:477:3: ( ( ruleQualifiedName ) )
            // InternalOntoUML.g:478:4: ( ruleQualifiedName )
            {
            // InternalOntoUML.g:478:4: ( ruleQualifiedName )
            // InternalOntoUML.g:479:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationAccess().getSubclassOntoUMLClassCrossReference_6_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleGeneralizationSet"
    // InternalOntoUML.g:497:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalOntoUML.g:497:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalOntoUML.g:498:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralizationSet=ruleGeneralizationSet();

            state._fsp--;

             current =iv_ruleGeneralizationSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // InternalOntoUML.g:504:1: ruleGeneralizationSet returns [EObject current=null] : ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) ( (lv_isComplete_1_0= 'complete' ) ) otherlv_2= 'GeneralizationSet' ( (lv_name_3_0= RULE_ID ) ) ( (lv_alias_4_0= RULE_STRING ) )? otherlv_5= 'generalizations' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token lv_isDisjoint_0_0=null;
        Token lv_isComplete_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_alias_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalOntoUML.g:510:2: ( ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) ( (lv_isComplete_1_0= 'complete' ) ) otherlv_2= 'GeneralizationSet' ( (lv_name_3_0= RULE_ID ) ) ( (lv_alias_4_0= RULE_STRING ) )? otherlv_5= 'generalizations' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* ) )
            // InternalOntoUML.g:511:2: ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) ( (lv_isComplete_1_0= 'complete' ) ) otherlv_2= 'GeneralizationSet' ( (lv_name_3_0= RULE_ID ) ) ( (lv_alias_4_0= RULE_STRING ) )? otherlv_5= 'generalizations' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )
            {
            // InternalOntoUML.g:511:2: ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) ( (lv_isComplete_1_0= 'complete' ) ) otherlv_2= 'GeneralizationSet' ( (lv_name_3_0= RULE_ID ) ) ( (lv_alias_4_0= RULE_STRING ) )? otherlv_5= 'generalizations' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )
            // InternalOntoUML.g:512:3: ( (lv_isDisjoint_0_0= 'disjoint' ) ) ( (lv_isComplete_1_0= 'complete' ) ) otherlv_2= 'GeneralizationSet' ( (lv_name_3_0= RULE_ID ) ) ( (lv_alias_4_0= RULE_STRING ) )? otherlv_5= 'generalizations' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
            {
            // InternalOntoUML.g:512:3: ( (lv_isDisjoint_0_0= 'disjoint' ) )
            // InternalOntoUML.g:513:4: (lv_isDisjoint_0_0= 'disjoint' )
            {
            // InternalOntoUML.g:513:4: (lv_isDisjoint_0_0= 'disjoint' )
            // InternalOntoUML.g:514:5: lv_isDisjoint_0_0= 'disjoint'
            {
            lv_isDisjoint_0_0=(Token)match(input,21,FOLLOW_15); 

            					newLeafNode(lv_isDisjoint_0_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            					setWithLastConsumed(current, "isDisjoint", true, "disjoint");
            				

            }


            }

            // InternalOntoUML.g:526:3: ( (lv_isComplete_1_0= 'complete' ) )
            // InternalOntoUML.g:527:4: (lv_isComplete_1_0= 'complete' )
            {
            // InternalOntoUML.g:527:4: (lv_isComplete_1_0= 'complete' )
            // InternalOntoUML.g:528:5: lv_isComplete_1_0= 'complete'
            {
            lv_isComplete_1_0=(Token)match(input,22,FOLLOW_16); 

            					newLeafNode(lv_isComplete_1_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            					setWithLastConsumed(current, "isComplete", true, "complete");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralizationSetAccess().getGeneralizationSetKeyword_2());
            		
            // InternalOntoUML.g:544:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalOntoUML.g:545:4: (lv_name_3_0= RULE_ID )
            {
            // InternalOntoUML.g:545:4: (lv_name_3_0= RULE_ID )
            // InternalOntoUML.g:546:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_3_0, grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalOntoUML.g:562:3: ( (lv_alias_4_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOntoUML.g:563:4: (lv_alias_4_0= RULE_STRING )
                    {
                    // InternalOntoUML.g:563:4: (lv_alias_4_0= RULE_STRING )
                    // InternalOntoUML.g:564:5: lv_alias_4_0= RULE_STRING
                    {
                    lv_alias_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    					newLeafNode(lv_alias_4_0, grammarAccess.getGeneralizationSetAccess().getAliasSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"alias",
                    						lv_alias_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneralizationSetAccess().getGeneralizationsKeyword_5());
            		
            // InternalOntoUML.g:584:3: ( ( ruleQualifiedName ) )
            // InternalOntoUML.g:585:4: ( ruleQualifiedName )
            {
            // InternalOntoUML.g:585:4: ( ruleQualifiedName )
            // InternalOntoUML.g:586:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_6_0());
            				
            pushFollow(FOLLOW_19);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOntoUML.g:600:3: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalOntoUML.g:601:4: otherlv_7= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getGeneralizationSetAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalOntoUML.g:605:4: ( ( ruleQualifiedName ) )
            	    // InternalOntoUML.g:606:5: ( ruleQualifiedName )
            	    {
            	    // InternalOntoUML.g:606:5: ( ruleQualifiedName )
            	    // InternalOntoUML.g:607:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "ruleEndurantType"
    // InternalOntoUML.g:626:1: ruleEndurantType returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'kind' ) | (enumLiteral_2= 'relatorKind' ) | (enumLiteral_3= 'modeKind' ) | (enumLiteral_4= 'qualityKind' ) | (enumLiteral_5= 'subkind' ) | (enumLiteral_6= 'role' ) | (enumLiteral_7= 'phase' ) | (enumLiteral_8= 'category' ) | (enumLiteral_9= 'mixin' ) | (enumLiteral_10= 'roleMixin' ) | (enumLiteral_11= 'phaseMixin' ) ) ;
    public final Enumerator ruleEndurantType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalOntoUML.g:632:2: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'kind' ) | (enumLiteral_2= 'relatorKind' ) | (enumLiteral_3= 'modeKind' ) | (enumLiteral_4= 'qualityKind' ) | (enumLiteral_5= 'subkind' ) | (enumLiteral_6= 'role' ) | (enumLiteral_7= 'phase' ) | (enumLiteral_8= 'category' ) | (enumLiteral_9= 'mixin' ) | (enumLiteral_10= 'roleMixin' ) | (enumLiteral_11= 'phaseMixin' ) ) )
            // InternalOntoUML.g:633:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'kind' ) | (enumLiteral_2= 'relatorKind' ) | (enumLiteral_3= 'modeKind' ) | (enumLiteral_4= 'qualityKind' ) | (enumLiteral_5= 'subkind' ) | (enumLiteral_6= 'role' ) | (enumLiteral_7= 'phase' ) | (enumLiteral_8= 'category' ) | (enumLiteral_9= 'mixin' ) | (enumLiteral_10= 'roleMixin' ) | (enumLiteral_11= 'phaseMixin' ) )
            {
            // InternalOntoUML.g:633:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'kind' ) | (enumLiteral_2= 'relatorKind' ) | (enumLiteral_3= 'modeKind' ) | (enumLiteral_4= 'qualityKind' ) | (enumLiteral_5= 'subkind' ) | (enumLiteral_6= 'role' ) | (enumLiteral_7= 'phase' ) | (enumLiteral_8= 'category' ) | (enumLiteral_9= 'mixin' ) | (enumLiteral_10= 'roleMixin' ) | (enumLiteral_11= 'phaseMixin' ) )
            int alt9=12;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            case 29:
                {
                alt9=5;
                }
                break;
            case 30:
                {
                alt9=6;
                }
                break;
            case 31:
                {
                alt9=7;
                }
                break;
            case 32:
                {
                alt9=8;
                }
                break;
            case 33:
                {
                alt9=9;
                }
                break;
            case 34:
                {
                alt9=10;
                }
                break;
            case 35:
                {
                alt9=11;
                }
                break;
            case 36:
                {
                alt9=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalOntoUML.g:634:3: (enumLiteral_0= 'none' )
                    {
                    // InternalOntoUML.g:634:3: (enumLiteral_0= 'none' )
                    // InternalOntoUML.g:635:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEndurantTypeAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:642:3: (enumLiteral_1= 'kind' )
                    {
                    // InternalOntoUML.g:642:3: (enumLiteral_1= 'kind' )
                    // InternalOntoUML.g:643:4: enumLiteral_1= 'kind'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:650:3: (enumLiteral_2= 'relatorKind' )
                    {
                    // InternalOntoUML.g:650:3: (enumLiteral_2= 'relatorKind' )
                    // InternalOntoUML.g:651:4: enumLiteral_2= 'relatorKind'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:658:3: (enumLiteral_3= 'modeKind' )
                    {
                    // InternalOntoUML.g:658:3: (enumLiteral_3= 'modeKind' )
                    // InternalOntoUML.g:659:4: enumLiteral_3= 'modeKind'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoUML.g:666:3: (enumLiteral_4= 'qualityKind' )
                    {
                    // InternalOntoUML.g:666:3: (enumLiteral_4= 'qualityKind' )
                    // InternalOntoUML.g:667:4: enumLiteral_4= 'qualityKind'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoUML.g:674:3: (enumLiteral_5= 'subkind' )
                    {
                    // InternalOntoUML.g:674:3: (enumLiteral_5= 'subkind' )
                    // InternalOntoUML.g:675:4: enumLiteral_5= 'subkind'
                    {
                    enumLiteral_5=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOntoUML.g:682:3: (enumLiteral_6= 'role' )
                    {
                    // InternalOntoUML.g:682:3: (enumLiteral_6= 'role' )
                    // InternalOntoUML.g:683:4: enumLiteral_6= 'role'
                    {
                    enumLiteral_6=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOntoUML.g:690:3: (enumLiteral_7= 'phase' )
                    {
                    // InternalOntoUML.g:690:3: (enumLiteral_7= 'phase' )
                    // InternalOntoUML.g:691:4: enumLiteral_7= 'phase'
                    {
                    enumLiteral_7=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOntoUML.g:698:3: (enumLiteral_8= 'category' )
                    {
                    // InternalOntoUML.g:698:3: (enumLiteral_8= 'category' )
                    // InternalOntoUML.g:699:4: enumLiteral_8= 'category'
                    {
                    enumLiteral_8=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOntoUML.g:706:3: (enumLiteral_9= 'mixin' )
                    {
                    // InternalOntoUML.g:706:3: (enumLiteral_9= 'mixin' )
                    // InternalOntoUML.g:707:4: enumLiteral_9= 'mixin'
                    {
                    enumLiteral_9=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalOntoUML.g:714:3: (enumLiteral_10= 'roleMixin' )
                    {
                    // InternalOntoUML.g:714:3: (enumLiteral_10= 'roleMixin' )
                    // InternalOntoUML.g:715:4: enumLiteral_10= 'roleMixin'
                    {
                    enumLiteral_10=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalOntoUML.g:722:3: (enumLiteral_11= 'phaseMixin' )
                    {
                    // InternalOntoUML.g:722:3: (enumLiteral_11= 'phaseMixin' )
                    // InternalOntoUML.g:723:4: enumLiteral_11= 'phaseMixin'
                    {
                    enumLiteral_11=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getPhaseMixinEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getEndurantTypeAccess().getPhaseMixinEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndurantType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001FFE250000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002002L});

}