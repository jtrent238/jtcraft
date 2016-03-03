/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParser;
/*     */ import java.io.IOException;
/*     */ import java.net.URL;
/*     */ import java.net.URLEncoder;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import tv.twitch.AuthToken;
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
/*     */ class bup
/*     */   extends Thread
/*     */ {
/*  77 */   bup(buo parambuo, String paramString1, String paramString2) { super(paramString1); }
/*     */   
/*     */   public void run() {
/*     */     try {
/*  81 */       URL localURL = new URL("https://api.twitch.tv/kraken?oauth_token=" + URLEncoder.encode(this.a, "UTF-8"));
/*  82 */       String str1 = pv.a(localURL);
/*  83 */       JsonObject localJsonObject1 = pu.l(new JsonParser().parse(str1), "Response");
/*  84 */       JsonObject localJsonObject2 = pu.s(localJsonObject1, "token");
/*     */       
/*  86 */       if (pu.i(localJsonObject2, "valid")) {
/*  87 */         String str2 = pu.h(localJsonObject2, "user_name");
/*  88 */         buo.J().debug(buo.a, "Authenticated with twitch; username is {}", new Object[] { str2 });
/*  89 */         AuthToken localAuthToken = new AuthToken();
/*  90 */         localAuthToken.data = this.a;
/*     */         
/*  92 */         buo.a(this.b).a(str2, localAuthToken);
/*  93 */         buo.b(this.b).c(str2);
/*  94 */         buo.b(this.b).a(localAuthToken);
/*     */         
/*  96 */         Runtime.getRuntime().addShutdownHook(new buq(this, "Twitch shutdown hook"));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 102 */         buo.a(this.b).A();
/*     */       } else {
/* 104 */         buo.a(this.b, bun.b);
/* 105 */         buo.J().error(buo.a, "Given twitch access token is invalid");
/*     */       }
/*     */     } catch (IOException localIOException) {
/* 108 */       buo.a(this.b, bun.a);
/* 109 */       buo.J().error(buo.a, "Could not authenticate with twitch", localIOException);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */