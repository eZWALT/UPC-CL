
// Generated from Calc.g4 by ANTLR 4.11.1


#include "CalcLexer.h"


using namespace antlr4;



using namespace antlr4;

namespace {

struct CalcLexerStaticData final {
  CalcLexerStaticData(std::vector<std::string> ruleNames,
                          std::vector<std::string> channelNames,
                          std::vector<std::string> modeNames,
                          std::vector<std::string> literalNames,
                          std::vector<std::string> symbolicNames)
      : ruleNames(std::move(ruleNames)), channelNames(std::move(channelNames)),
        modeNames(std::move(modeNames)), literalNames(std::move(literalNames)),
        symbolicNames(std::move(symbolicNames)),
        vocabulary(this->literalNames, this->symbolicNames) {}

  CalcLexerStaticData(const CalcLexerStaticData&) = delete;
  CalcLexerStaticData(CalcLexerStaticData&&) = delete;
  CalcLexerStaticData& operator=(const CalcLexerStaticData&) = delete;
  CalcLexerStaticData& operator=(CalcLexerStaticData&&) = delete;

  std::vector<antlr4::dfa::DFA> decisionToDFA;
  antlr4::atn::PredictionContextCache sharedContextCache;
  const std::vector<std::string> ruleNames;
  const std::vector<std::string> channelNames;
  const std::vector<std::string> modeNames;
  const std::vector<std::string> literalNames;
  const std::vector<std::string> symbolicNames;
  const antlr4::dfa::Vocabulary vocabulary;
  antlr4::atn::SerializedATNView serializedATN;
  std::unique_ptr<antlr4::atn::ATN> atn;
};

::antlr4::internal::OnceFlag calclexerLexerOnceFlag;
CalcLexerStaticData *calclexerLexerStaticData = nullptr;

void calclexerLexerInitialize() {
  assert(calclexerLexerStaticData == nullptr);
  auto staticData = std::make_unique<CalcLexerStaticData>(
    std::vector<std::string>{
      "T__0", "LPAR", "RPAR", "MUL", "ADD", "SUB", "MOD", "DIV", "ABS", 
      "MIN", "MAX", "COMMA", "MYSTERY", "ID", "INT", "NEWLINE", "WS"
    },
    std::vector<std::string>{
      "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    },
    std::vector<std::string>{
      "DEFAULT_MODE"
    },
    std::vector<std::string>{
      "", "'='", "'('", "')'", "'*'", "'+'", "'-'", "'%'", "'/'", "'abs'", 
      "'min'", "'max'", "','", "'mistery'"
    },
    std::vector<std::string>{
      "", "", "LPAR", "RPAR", "MUL", "ADD", "SUB", "MOD", "DIV", "ABS", 
      "MIN", "MAX", "COMMA", "MYSTERY", "ID", "INT", "NEWLINE", "WS"
    }
  );
  static const int32_t serializedATNSegment[] = {
  	4,0,17,95,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
  	6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,
  	7,14,2,15,7,15,2,16,7,16,1,0,1,0,1,1,1,1,1,2,1,2,1,3,1,3,1,4,1,4,1,5,
  	1,5,1,6,1,6,1,7,1,7,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,
  	10,1,11,1,11,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,13,4,13,75,8,13,
  	11,13,12,13,76,1,14,4,14,80,8,14,11,14,12,14,81,1,15,3,15,85,8,15,1,15,
  	1,15,1,16,4,16,90,8,16,11,16,12,16,91,1,16,1,16,0,0,17,1,1,3,2,5,3,7,
  	4,9,5,11,6,13,7,15,8,17,9,19,10,21,11,23,12,25,13,27,14,29,15,31,16,33,
  	17,1,0,3,2,0,65,90,97,122,1,0,48,57,2,0,9,9,32,32,98,0,1,1,0,0,0,0,3,
  	1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,
  	0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,
  	1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,1,35,1,0,
  	0,0,3,37,1,0,0,0,5,39,1,0,0,0,7,41,1,0,0,0,9,43,1,0,0,0,11,45,1,0,0,0,
  	13,47,1,0,0,0,15,49,1,0,0,0,17,51,1,0,0,0,19,55,1,0,0,0,21,59,1,0,0,0,
  	23,63,1,0,0,0,25,65,1,0,0,0,27,74,1,0,0,0,29,79,1,0,0,0,31,84,1,0,0,0,
  	33,89,1,0,0,0,35,36,5,61,0,0,36,2,1,0,0,0,37,38,5,40,0,0,38,4,1,0,0,0,
  	39,40,5,41,0,0,40,6,1,0,0,0,41,42,5,42,0,0,42,8,1,0,0,0,43,44,5,43,0,
  	0,44,10,1,0,0,0,45,46,5,45,0,0,46,12,1,0,0,0,47,48,5,37,0,0,48,14,1,0,
  	0,0,49,50,5,47,0,0,50,16,1,0,0,0,51,52,5,97,0,0,52,53,5,98,0,0,53,54,
  	5,115,0,0,54,18,1,0,0,0,55,56,5,109,0,0,56,57,5,105,0,0,57,58,5,110,0,
  	0,58,20,1,0,0,0,59,60,5,109,0,0,60,61,5,97,0,0,61,62,5,120,0,0,62,22,
  	1,0,0,0,63,64,5,44,0,0,64,24,1,0,0,0,65,66,5,109,0,0,66,67,5,105,0,0,
  	67,68,5,115,0,0,68,69,5,116,0,0,69,70,5,101,0,0,70,71,5,114,0,0,71,72,
  	5,121,0,0,72,26,1,0,0,0,73,75,7,0,0,0,74,73,1,0,0,0,75,76,1,0,0,0,76,
  	74,1,0,0,0,76,77,1,0,0,0,77,28,1,0,0,0,78,80,7,1,0,0,79,78,1,0,0,0,80,
  	81,1,0,0,0,81,79,1,0,0,0,81,82,1,0,0,0,82,30,1,0,0,0,83,85,5,13,0,0,84,
  	83,1,0,0,0,84,85,1,0,0,0,85,86,1,0,0,0,86,87,5,10,0,0,87,32,1,0,0,0,88,
  	90,7,2,0,0,89,88,1,0,0,0,90,91,1,0,0,0,91,89,1,0,0,0,91,92,1,0,0,0,92,
  	93,1,0,0,0,93,94,6,16,0,0,94,34,1,0,0,0,5,0,76,81,84,91,1,6,0,0
  };
  staticData->serializedATN = antlr4::atn::SerializedATNView(serializedATNSegment, sizeof(serializedATNSegment) / sizeof(serializedATNSegment[0]));

  antlr4::atn::ATNDeserializer deserializer;
  staticData->atn = deserializer.deserialize(staticData->serializedATN);

  const size_t count = staticData->atn->getNumberOfDecisions();
  staticData->decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    staticData->decisionToDFA.emplace_back(staticData->atn->getDecisionState(i), i);
  }
  calclexerLexerStaticData = staticData.release();
}

}

CalcLexer::CalcLexer(CharStream *input) : Lexer(input) {
  CalcLexer::initialize();
  _interpreter = new atn::LexerATNSimulator(this, *calclexerLexerStaticData->atn, calclexerLexerStaticData->decisionToDFA, calclexerLexerStaticData->sharedContextCache);
}

CalcLexer::~CalcLexer() {
  delete _interpreter;
}

std::string CalcLexer::getGrammarFileName() const {
  return "Calc.g4";
}

const std::vector<std::string>& CalcLexer::getRuleNames() const {
  return calclexerLexerStaticData->ruleNames;
}

const std::vector<std::string>& CalcLexer::getChannelNames() const {
  return calclexerLexerStaticData->channelNames;
}

const std::vector<std::string>& CalcLexer::getModeNames() const {
  return calclexerLexerStaticData->modeNames;
}

const dfa::Vocabulary& CalcLexer::getVocabulary() const {
  return calclexerLexerStaticData->vocabulary;
}

antlr4::atn::SerializedATNView CalcLexer::getSerializedATN() const {
  return calclexerLexerStaticData->serializedATN;
}

const atn::ATN& CalcLexer::getATN() const {
  return *calclexerLexerStaticData->atn;
}




void CalcLexer::initialize() {
  ::antlr4::internal::call_once(calclexerLexerOnceFlag, calclexerLexerInitialize);
}
