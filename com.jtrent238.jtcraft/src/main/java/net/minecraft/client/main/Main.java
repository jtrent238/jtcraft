/*     */ package net.minecraft.client.main;
/*     */ 
/*     */ import bao;
/*     */ import java.io.File;
/*     */ import java.net.Proxy;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import joptsimple.ArgumentAcceptingOptionSpec;
/*     */ import joptsimple.OptionParser;
/*     */ import joptsimple.OptionSet;
/*     */ import joptsimple.OptionSpec;
/*     */ import joptsimple.OptionSpecBuilder;
/*     */ 
/*     */ public class Main
/*     */ {
/*  17 */   private static final java.lang.reflect.Type a = new bgt();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void main(String[] paramArrayOfString)
/*     */   {
/*  56 */     System.setProperty("java.net.preferIPv4Stack", "true");
/*     */     
/*  58 */     OptionParser localOptionParser = new OptionParser();
/*  59 */     localOptionParser.allowsUnrecognizedOptions();
/*     */     
/*  61 */     localOptionParser.accepts("demo");
/*  62 */     localOptionParser.accepts("fullscreen");
/*  63 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec1 = localOptionParser.accepts("server").withRequiredArg();
/*  64 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec2 = localOptionParser.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(25565), new Integer[0]);
/*  65 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec3 = localOptionParser.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
/*  66 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec4 = localOptionParser.accepts("assetsDir").withRequiredArg().ofType(File.class);
/*  67 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec5 = localOptionParser.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
/*  68 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec6 = localOptionParser.accepts("proxyHost").withRequiredArg();
/*  69 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec7 = localOptionParser.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
/*  70 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec8 = localOptionParser.accepts("proxyUser").withRequiredArg();
/*  71 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec9 = localOptionParser.accepts("proxyPass").withRequiredArg();
/*  72 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec10 = localOptionParser.accepts("username").withRequiredArg().defaultsTo("Player" + bao.K() % 1000L, new String[0]);
/*  73 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec11 = localOptionParser.accepts("uuid").withRequiredArg();
/*  74 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec12 = localOptionParser.accepts("accessToken").withRequiredArg().required();
/*  75 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec13 = localOptionParser.accepts("version").withRequiredArg().required();
/*  76 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec14 = localOptionParser.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(854), new Integer[0]);
/*  77 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec15 = localOptionParser.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(480), new Integer[0]);
/*  78 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec16 = localOptionParser.accepts("userProperties").withRequiredArg().required();
/*  79 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec17 = localOptionParser.accepts("assetIndex").withRequiredArg();
/*  80 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec18 = localOptionParser.accepts("userType").withRequiredArg().defaultsTo("legacy", new String[0]);
/*  81 */     joptsimple.NonOptionArgumentSpec localNonOptionArgumentSpec = localOptionParser.nonOptions();
/*     */     
/*  83 */     OptionSet localOptionSet = localOptionParser.parse(paramArrayOfString);
/*  84 */     java.util.List localList = localOptionSet.valuesOf(localNonOptionArgumentSpec);
/*     */     
/*     */ 
/*  87 */     String str1 = (String)localOptionSet.valueOf(localArgumentAcceptingOptionSpec6);
/*  88 */     Proxy localProxy = Proxy.NO_PROXY;
/*  89 */     if (str1 != null) {
/*     */       try {
/*  91 */         localProxy = new Proxy(java.net.Proxy.Type.SOCKS, new java.net.InetSocketAddress(str1, ((Integer)localOptionSet.valueOf(localArgumentAcceptingOptionSpec7)).intValue()));
/*     */       }
/*     */       catch (Exception localException) {}
/*     */     }
/*     */     
/*     */ 
/*  97 */     String str2 = (String)localOptionSet.valueOf(localArgumentAcceptingOptionSpec8);
/*  98 */     String str3 = (String)localOptionSet.valueOf(localArgumentAcceptingOptionSpec9);
/*  99 */     if ((!localProxy.equals(Proxy.NO_PROXY)) && (a(str2)) && (a(str3))) {
/* 100 */       java.net.Authenticator.setDefault(new bgv(str2, str3));
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 109 */     int i = ((Integer)localOptionSet.valueOf(localArgumentAcceptingOptionSpec14)).intValue();
/* 110 */     int j = ((Integer)localOptionSet.valueOf(localArgumentAcceptingOptionSpec15)).intValue();
/* 111 */     boolean bool1 = localOptionSet.has("fullscreen");
/* 112 */     boolean bool2 = localOptionSet.has("demo");
/* 113 */     String str4 = (String)localOptionSet.valueOf(localArgumentAcceptingOptionSpec13);
/* 114 */     com.google.common.collect.HashMultimap localHashMultimap = com.google.common.collect.HashMultimap.create();
/*     */     
/* 116 */     for (Object localObject1 = ((Map)new com.google.gson.Gson().fromJson((String)localOptionSet.valueOf(localArgumentAcceptingOptionSpec16), a)).entrySet().iterator(); ((Iterator)localObject1).hasNext();) { localObject2 = (Map.Entry)((Iterator)localObject1).next();
/* 117 */       localHashMultimap.putAll(((Map.Entry)localObject2).getKey(), (Iterable)((Map.Entry)localObject2).getValue());
/*     */     }
/*     */     
/*     */ 
/* 121 */     localObject1 = (File)localOptionSet.valueOf(localArgumentAcceptingOptionSpec3);
/* 122 */     Object localObject2 = localOptionSet.has(localArgumentAcceptingOptionSpec4) ? (File)localOptionSet.valueOf(localArgumentAcceptingOptionSpec4) : new File((File)localObject1, "assets/");
/* 123 */     File localFile = localOptionSet.has(localArgumentAcceptingOptionSpec5) ? (File)localOptionSet.valueOf(localArgumentAcceptingOptionSpec5) : new File((File)localObject1, "resourcepacks/");
/* 124 */     String str5 = localOptionSet.has(localArgumentAcceptingOptionSpec11) ? (String)localArgumentAcceptingOptionSpec11.value(localOptionSet) : (String)localArgumentAcceptingOptionSpec10.value(localOptionSet);
/* 125 */     String str6 = localOptionSet.has(localArgumentAcceptingOptionSpec17) ? (String)localArgumentAcceptingOptionSpec17.value(localOptionSet) : null;
/*     */     
/*     */ 
/* 128 */     bbs localbbs = new bbs((String)localArgumentAcceptingOptionSpec10.value(localOptionSet), str5, (String)localArgumentAcceptingOptionSpec12.value(localOptionSet), (String)localArgumentAcceptingOptionSpec18.value(localOptionSet));
/* 129 */     bao localbao = new bao(localbbs, i, j, bool1, bool2, (File)localObject1, (File)localObject2, localFile, localProxy, str4, localHashMultimap, str6);
/*     */     
/*     */ 
/* 132 */     String str7 = (String)localOptionSet.valueOf(localArgumentAcceptingOptionSpec1);
/* 133 */     if (str7 != null) {
/* 134 */       localbao.a(str7, ((Integer)localOptionSet.valueOf(localArgumentAcceptingOptionSpec2)).intValue());
/*     */     }
/*     */     
/* 137 */     Runtime.getRuntime().addShutdownHook(new bgw("Client Shutdown Thread"));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 144 */     if (!localList.isEmpty()) { System.out.println("Completely ignored arguments: " + localList);
/*     */     }
/*     */     
/* 147 */     Thread.currentThread().setName("Client thread");
/* 148 */     localbao.f();
/*     */   }
/*     */   
/*     */   private static boolean a(String paramString) {
/* 152 */     return (paramString != null) && (!paramString.isEmpty());
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\client\main\Main.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */