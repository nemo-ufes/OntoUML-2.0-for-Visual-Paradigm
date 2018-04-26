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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "','", "'}'", "'Class'", "'supers...'", "'subs...'", "'Generalization'", "'superclass'", "'subclass'", "'disjoint'", "'complete'", "'GeneralizationSet'", "'generalizations'", "'none'", "'kind'", "'relatorKind'", "'modeKind'", "'qualityKind'", "'subkind'", "'role'", "'phase'", "'category'", "'mixin'", "'roleMixin'"
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


    // $ANTLR start "entryRuleModelElement"
    // InternalOntoUML.g:140:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // InternalOntoUML.g:140:53: (iv_ruleModelElement= ruleModelElement EOF )
            // InternalOntoUML.g:141:2: iv_ruleModelElement= ruleModelElement EOF
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
    // InternalOntoUML.g:147:1: ruleModelElement returns [EObject current=null] : (this_OntoUMLClass_0= ruleOntoUMLClass | this_Generalization_1= ruleGeneralization | this_GeneralizationSet_2= ruleGeneralizationSet ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_OntoUMLClass_0 = null;

        EObject this_Generalization_1 = null;

        EObject this_GeneralizationSet_2 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:153:2: ( (this_OntoUMLClass_0= ruleOntoUMLClass | this_Generalization_1= ruleGeneralization | this_GeneralizationSet_2= ruleGeneralizationSet ) )
            // InternalOntoUML.g:154:2: (this_OntoUMLClass_0= ruleOntoUMLClass | this_Generalization_1= ruleGeneralization | this_GeneralizationSet_2= ruleGeneralizationSet )
            {
            // InternalOntoUML.g:154:2: (this_OntoUMLClass_0= ruleOntoUMLClass | this_Generalization_1= ruleGeneralization | this_GeneralizationSet_2= ruleGeneralizationSet )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
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
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOntoUML.g:155:3: this_OntoUMLClass_0= ruleOntoUMLClass
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getOntoUMLClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OntoUMLClass_0=ruleOntoUMLClass();

                    state._fsp--;


                    			current = this_OntoUMLClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:164:3: this_Generalization_1= ruleGeneralization
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getGeneralizationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generalization_1=ruleGeneralization();

                    state._fsp--;


                    			current = this_Generalization_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:173:3: this_GeneralizationSet_2= ruleGeneralizationSet
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GeneralizationSet_2=ruleGeneralizationSet();

                    state._fsp--;


                    			current = this_GeneralizationSet_2;
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


    // $ANTLR start "entryRuleOntoUMLClass"
    // InternalOntoUML.g:185:1: entryRuleOntoUMLClass returns [EObject current=null] : iv_ruleOntoUMLClass= ruleOntoUMLClass EOF ;
    public final EObject entryRuleOntoUMLClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOntoUMLClass = null;


        try {
            // InternalOntoUML.g:185:53: (iv_ruleOntoUMLClass= ruleOntoUMLClass EOF )
            // InternalOntoUML.g:186:2: iv_ruleOntoUMLClass= ruleOntoUMLClass EOF
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
    // InternalOntoUML.g:192:1: ruleOntoUMLClass returns [EObject current=null] : ( ( (lv__type_0_0= ruleEndurantType ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) )? (otherlv_4= 'supers...' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'subs...' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}' )? ) ;
    public final EObject ruleOntoUMLClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_alias_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv__type_0_0 = null;



        	enterRule();

        try {
            // InternalOntoUML.g:198:2: ( ( ( (lv__type_0_0= ruleEndurantType ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) )? (otherlv_4= 'supers...' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'subs...' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}' )? ) )
            // InternalOntoUML.g:199:2: ( ( (lv__type_0_0= ruleEndurantType ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) )? (otherlv_4= 'supers...' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'subs...' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}' )? )
            {
            // InternalOntoUML.g:199:2: ( ( (lv__type_0_0= ruleEndurantType ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) )? (otherlv_4= 'supers...' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'subs...' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}' )? )
            // InternalOntoUML.g:200:3: ( (lv__type_0_0= ruleEndurantType ) )? otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_alias_3_0= RULE_STRING ) )? (otherlv_4= 'supers...' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'subs...' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}' )?
            {
            // InternalOntoUML.g:200:3: ( (lv__type_0_0= ruleEndurantType ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=25 && LA3_0<=35)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOntoUML.g:201:4: (lv__type_0_0= ruleEndurantType )
                    {
                    // InternalOntoUML.g:201:4: (lv__type_0_0= ruleEndurantType )
                    // InternalOntoUML.g:202:5: lv__type_0_0= ruleEndurantType
                    {

                    					newCompositeNode(grammarAccess.getOntoUMLClassAccess().get_typeEndurantTypeEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_6);
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
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOntoUMLClassAccess().getClassKeyword_1());
            		
            // InternalOntoUML.g:223:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalOntoUML.g:224:4: (lv_name_2_0= RULE_ID )
            {
            // InternalOntoUML.g:224:4: (lv_name_2_0= RULE_ID )
            // InternalOntoUML.g:225:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalOntoUML.g:241:3: ( (lv_alias_3_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOntoUML.g:242:4: (lv_alias_3_0= RULE_STRING )
                    {
                    // InternalOntoUML.g:242:4: (lv_alias_3_0= RULE_STRING )
                    // InternalOntoUML.g:243:5: lv_alias_3_0= RULE_STRING
                    {
                    lv_alias_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            // InternalOntoUML.g:259:3: (otherlv_4= 'supers...' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOntoUML.g:260:4: otherlv_4= 'supers...' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getOntoUMLClassAccess().getSupersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getOntoUMLClassAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalOntoUML.g:268:4: ( (otherlv_6= RULE_ID ) )
                    // InternalOntoUML.g:269:5: (otherlv_6= RULE_ID )
                    {
                    // InternalOntoUML.g:269:5: (otherlv_6= RULE_ID )
                    // InternalOntoUML.g:270:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOntoUMLClassRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_6, grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesGeneralizationCrossReference_4_2_0());
                    					

                    }


                    }

                    // InternalOntoUML.g:281:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalOntoUML.g:282:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getOntoUMLClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOntoUML.g:286:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalOntoUML.g:287:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalOntoUML.g:287:6: (otherlv_8= RULE_ID )
                    	    // InternalOntoUML.g:288:7: otherlv_8= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOntoUMLClassRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_5); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSuperclassesGeneralizationCrossReference_4_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getOntoUMLClassAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalOntoUML.g:305:3: (otherlv_10= 'subs...' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOntoUML.g:306:4: otherlv_10= 'subs...' otherlv_11= '{' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getOntoUMLClassAccess().getSubsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getOntoUMLClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalOntoUML.g:314:4: ( (otherlv_12= RULE_ID ) )
                    // InternalOntoUML.g:315:5: (otherlv_12= RULE_ID )
                    {
                    // InternalOntoUML.g:315:5: (otherlv_12= RULE_ID )
                    // InternalOntoUML.g:316:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOntoUMLClassRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_12, grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesGeneralizationCrossReference_5_2_0());
                    					

                    }


                    }

                    // InternalOntoUML.g:327:4: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalOntoUML.g:328:5: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getOntoUMLClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalOntoUML.g:332:5: ( (otherlv_14= RULE_ID ) )
                    	    // InternalOntoUML.g:333:6: (otherlv_14= RULE_ID )
                    	    {
                    	    // InternalOntoUML.g:333:6: (otherlv_14= RULE_ID )
                    	    // InternalOntoUML.g:334:7: otherlv_14= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOntoUMLClassRule());
                    	    							}
                    	    						
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_5); 

                    	    							newLeafNode(otherlv_14, grammarAccess.getOntoUMLClassAccess().getGeneralizationsToSubclassesGeneralizationCrossReference_5_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getOntoUMLClassAccess().getRightCurlyBracketKeyword_5_4());
                    			

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
    // InternalOntoUML.g:355:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // InternalOntoUML.g:355:55: (iv_ruleGeneralization= ruleGeneralization EOF )
            // InternalOntoUML.g:356:2: iv_ruleGeneralization= ruleGeneralization EOF
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
    // InternalOntoUML.g:362:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'Generalization' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= 'superclass' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'subclass' ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_alias_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalOntoUML.g:368:2: ( (otherlv_0= 'Generalization' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= 'superclass' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'subclass' ( (otherlv_6= RULE_ID ) ) ) )
            // InternalOntoUML.g:369:2: (otherlv_0= 'Generalization' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= 'superclass' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'subclass' ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalOntoUML.g:369:2: (otherlv_0= 'Generalization' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= 'superclass' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'subclass' ( (otherlv_6= RULE_ID ) ) )
            // InternalOntoUML.g:370:3: otherlv_0= 'Generalization' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alias_2_0= RULE_STRING ) )? otherlv_3= 'superclass' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'subclass' ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGeneralizationKeyword_0());
            		
            // InternalOntoUML.g:374:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOntoUML.g:375:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOntoUML.g:375:4: (lv_name_1_0= RULE_ID )
            // InternalOntoUML.g:376:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalOntoUML.g:392:3: ( (lv_alias_2_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOntoUML.g:393:4: (lv_alias_2_0= RULE_STRING )
                    {
                    // InternalOntoUML.g:393:4: (lv_alias_2_0= RULE_STRING )
                    // InternalOntoUML.g:394:5: lv_alias_2_0= RULE_STRING
                    {
                    lv_alias_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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
            		
            // InternalOntoUML.g:414:3: ( (otherlv_4= RULE_ID ) )
            // InternalOntoUML.g:415:4: (otherlv_4= RULE_ID )
            {
            // InternalOntoUML.g:415:4: (otherlv_4= RULE_ID )
            // InternalOntoUML.g:416:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_4, grammarAccess.getGeneralizationAccess().getSuperclassOntoUMLClassCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneralizationAccess().getSubclassKeyword_5());
            		
            // InternalOntoUML.g:431:3: ( (otherlv_6= RULE_ID ) )
            // InternalOntoUML.g:432:4: (otherlv_6= RULE_ID )
            {
            // InternalOntoUML.g:432:4: (otherlv_6= RULE_ID )
            // InternalOntoUML.g:433:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getGeneralizationAccess().getSubclassOntoUMLClassCrossReference_6_0());
            				

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
    // InternalOntoUML.g:448:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // InternalOntoUML.g:448:58: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // InternalOntoUML.g:449:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
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
    // InternalOntoUML.g:455:1: ruleGeneralizationSet returns [EObject current=null] : ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) ( (lv_isComplete_1_0= 'complete' ) ) otherlv_2= 'GeneralizationSet' ( (lv_name_3_0= RULE_ID ) ) ( (lv_alias_4_0= RULE_STRING ) )? otherlv_5= 'generalizations' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token lv_isDisjoint_0_0=null;
        Token lv_isComplete_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_alias_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalOntoUML.g:461:2: ( ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) ( (lv_isComplete_1_0= 'complete' ) ) otherlv_2= 'GeneralizationSet' ( (lv_name_3_0= RULE_ID ) ) ( (lv_alias_4_0= RULE_STRING ) )? otherlv_5= 'generalizations' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' ) )
            // InternalOntoUML.g:462:2: ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) ( (lv_isComplete_1_0= 'complete' ) ) otherlv_2= 'GeneralizationSet' ( (lv_name_3_0= RULE_ID ) ) ( (lv_alias_4_0= RULE_STRING ) )? otherlv_5= 'generalizations' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )
            {
            // InternalOntoUML.g:462:2: ( ( (lv_isDisjoint_0_0= 'disjoint' ) ) ( (lv_isComplete_1_0= 'complete' ) ) otherlv_2= 'GeneralizationSet' ( (lv_name_3_0= RULE_ID ) ) ( (lv_alias_4_0= RULE_STRING ) )? otherlv_5= 'generalizations' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}' )
            // InternalOntoUML.g:463:3: ( (lv_isDisjoint_0_0= 'disjoint' ) ) ( (lv_isComplete_1_0= 'complete' ) ) otherlv_2= 'GeneralizationSet' ( (lv_name_3_0= RULE_ID ) ) ( (lv_alias_4_0= RULE_STRING ) )? otherlv_5= 'generalizations' otherlv_6= '{' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= '}'
            {
            // InternalOntoUML.g:463:3: ( (lv_isDisjoint_0_0= 'disjoint' ) )
            // InternalOntoUML.g:464:4: (lv_isDisjoint_0_0= 'disjoint' )
            {
            // InternalOntoUML.g:464:4: (lv_isDisjoint_0_0= 'disjoint' )
            // InternalOntoUML.g:465:5: lv_isDisjoint_0_0= 'disjoint'
            {
            lv_isDisjoint_0_0=(Token)match(input,21,FOLLOW_14); 

            					newLeafNode(lv_isDisjoint_0_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            					setWithLastConsumed(current, "isDisjoint", true, "disjoint");
            				

            }


            }

            // InternalOntoUML.g:477:3: ( (lv_isComplete_1_0= 'complete' ) )
            // InternalOntoUML.g:478:4: (lv_isComplete_1_0= 'complete' )
            {
            // InternalOntoUML.g:478:4: (lv_isComplete_1_0= 'complete' )
            // InternalOntoUML.g:479:5: lv_isComplete_1_0= 'complete'
            {
            lv_isComplete_1_0=(Token)match(input,22,FOLLOW_15); 

            					newLeafNode(lv_isComplete_1_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            					setWithLastConsumed(current, "isComplete", true, "complete");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralizationSetAccess().getGeneralizationSetKeyword_2());
            		
            // InternalOntoUML.g:495:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalOntoUML.g:496:4: (lv_name_3_0= RULE_ID )
            {
            // InternalOntoUML.g:496:4: (lv_name_3_0= RULE_ID )
            // InternalOntoUML.g:497:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalOntoUML.g:513:3: ( (lv_alias_4_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOntoUML.g:514:4: (lv_alias_4_0= RULE_STRING )
                    {
                    // InternalOntoUML.g:514:4: (lv_alias_4_0= RULE_STRING )
                    // InternalOntoUML.g:515:5: lv_alias_4_0= RULE_STRING
                    {
                    lv_alias_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_5=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneralizationSetAccess().getGeneralizationsKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getGeneralizationSetAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalOntoUML.g:539:3: ( (otherlv_7= RULE_ID ) )
            // InternalOntoUML.g:540:4: (otherlv_7= RULE_ID )
            {
            // InternalOntoUML.g:540:4: (otherlv_7= RULE_ID )
            // InternalOntoUML.g:541:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralizationSetRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_7, grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_7_0());
            				

            }


            }

            // InternalOntoUML.g:552:3: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOntoUML.g:553:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_8, grammarAccess.getGeneralizationSetAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalOntoUML.g:557:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalOntoUML.g:558:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalOntoUML.g:558:5: (otherlv_9= RULE_ID )
            	    // InternalOntoUML.g:559:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    						newLeafNode(otherlv_9, grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationCrossReference_8_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getGeneralizationSetAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalOntoUML.g:579:1: ruleEndurantType returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'kind' ) | (enumLiteral_2= 'relatorKind' ) | (enumLiteral_3= 'modeKind' ) | (enumLiteral_4= 'qualityKind' ) | (enumLiteral_5= 'subkind' ) | (enumLiteral_6= 'role' ) | (enumLiteral_7= 'phase' ) | (enumLiteral_8= 'category' ) | (enumLiteral_9= 'mixin' ) | (enumLiteral_10= 'roleMixin' ) ) ;
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


        	enterRule();

        try {
            // InternalOntoUML.g:585:2: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'kind' ) | (enumLiteral_2= 'relatorKind' ) | (enumLiteral_3= 'modeKind' ) | (enumLiteral_4= 'qualityKind' ) | (enumLiteral_5= 'subkind' ) | (enumLiteral_6= 'role' ) | (enumLiteral_7= 'phase' ) | (enumLiteral_8= 'category' ) | (enumLiteral_9= 'mixin' ) | (enumLiteral_10= 'roleMixin' ) ) )
            // InternalOntoUML.g:586:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'kind' ) | (enumLiteral_2= 'relatorKind' ) | (enumLiteral_3= 'modeKind' ) | (enumLiteral_4= 'qualityKind' ) | (enumLiteral_5= 'subkind' ) | (enumLiteral_6= 'role' ) | (enumLiteral_7= 'phase' ) | (enumLiteral_8= 'category' ) | (enumLiteral_9= 'mixin' ) | (enumLiteral_10= 'roleMixin' ) )
            {
            // InternalOntoUML.g:586:2: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'kind' ) | (enumLiteral_2= 'relatorKind' ) | (enumLiteral_3= 'modeKind' ) | (enumLiteral_4= 'qualityKind' ) | (enumLiteral_5= 'subkind' ) | (enumLiteral_6= 'role' ) | (enumLiteral_7= 'phase' ) | (enumLiteral_8= 'category' ) | (enumLiteral_9= 'mixin' ) | (enumLiteral_10= 'roleMixin' ) )
            int alt12=11;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            case 29:
                {
                alt12=5;
                }
                break;
            case 30:
                {
                alt12=6;
                }
                break;
            case 31:
                {
                alt12=7;
                }
                break;
            case 32:
                {
                alt12=8;
                }
                break;
            case 33:
                {
                alt12=9;
                }
                break;
            case 34:
                {
                alt12=10;
                }
                break;
            case 35:
                {
                alt12=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalOntoUML.g:587:3: (enumLiteral_0= 'none' )
                    {
                    // InternalOntoUML.g:587:3: (enumLiteral_0= 'none' )
                    // InternalOntoUML.g:588:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEndurantTypeAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOntoUML.g:595:3: (enumLiteral_1= 'kind' )
                    {
                    // InternalOntoUML.g:595:3: (enumLiteral_1= 'kind' )
                    // InternalOntoUML.g:596:4: enumLiteral_1= 'kind'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEndurantTypeAccess().getKindEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOntoUML.g:603:3: (enumLiteral_2= 'relatorKind' )
                    {
                    // InternalOntoUML.g:603:3: (enumLiteral_2= 'relatorKind' )
                    // InternalOntoUML.g:604:4: enumLiteral_2= 'relatorKind'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEndurantTypeAccess().getRelatorKindEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOntoUML.g:611:3: (enumLiteral_3= 'modeKind' )
                    {
                    // InternalOntoUML.g:611:3: (enumLiteral_3= 'modeKind' )
                    // InternalOntoUML.g:612:4: enumLiteral_3= 'modeKind'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEndurantTypeAccess().getModeKindEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOntoUML.g:619:3: (enumLiteral_4= 'qualityKind' )
                    {
                    // InternalOntoUML.g:619:3: (enumLiteral_4= 'qualityKind' )
                    // InternalOntoUML.g:620:4: enumLiteral_4= 'qualityKind'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEndurantTypeAccess().getQualityKindEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOntoUML.g:627:3: (enumLiteral_5= 'subkind' )
                    {
                    // InternalOntoUML.g:627:3: (enumLiteral_5= 'subkind' )
                    // InternalOntoUML.g:628:4: enumLiteral_5= 'subkind'
                    {
                    enumLiteral_5=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEndurantTypeAccess().getSubkindEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOntoUML.g:635:3: (enumLiteral_6= 'role' )
                    {
                    // InternalOntoUML.g:635:3: (enumLiteral_6= 'role' )
                    // InternalOntoUML.g:636:4: enumLiteral_6= 'role'
                    {
                    enumLiteral_6=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEndurantTypeAccess().getRoleEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOntoUML.g:643:3: (enumLiteral_7= 'phase' )
                    {
                    // InternalOntoUML.g:643:3: (enumLiteral_7= 'phase' )
                    // InternalOntoUML.g:644:4: enumLiteral_7= 'phase'
                    {
                    enumLiteral_7=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getEndurantTypeAccess().getPhaseEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOntoUML.g:651:3: (enumLiteral_8= 'category' )
                    {
                    // InternalOntoUML.g:651:3: (enumLiteral_8= 'category' )
                    // InternalOntoUML.g:652:4: enumLiteral_8= 'category'
                    {
                    enumLiteral_8=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getEndurantTypeAccess().getCategoryEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOntoUML.g:659:3: (enumLiteral_9= 'mixin' )
                    {
                    // InternalOntoUML.g:659:3: (enumLiteral_9= 'mixin' )
                    // InternalOntoUML.g:660:4: enumLiteral_9= 'mixin'
                    {
                    enumLiteral_9=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getEndurantTypeAccess().getMixinEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalOntoUML.g:667:3: (enumLiteral_10= 'roleMixin' )
                    {
                    // InternalOntoUML.g:667:3: (enumLiteral_10= 'roleMixin' )
                    // InternalOntoUML.g:668:4: enumLiteral_10= 'roleMixin'
                    {
                    enumLiteral_10=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getEndurantTypeAccess().getRoleMixinEnumLiteralDeclaration_10());
                    			

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000FFE248000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});

}