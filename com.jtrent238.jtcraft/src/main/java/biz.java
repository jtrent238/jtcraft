/*     */ import com.mojang.authlib.exceptions.AuthenticationException;
/*     */ import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
/*     */ import com.mojang.authlib.exceptions.InvalidCredentialsException;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.math.BigInteger;
/*     */ import java.security.PublicKey;
/*     */ import java.util.UUID;
/*     */ import javax.crypto.SecretKey;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class biz
/*     */   implements jr
/*     */ {
/*  28 */   private static final Logger a = ;
/*     */   private final bao b;
/*     */   private final bdw c;
/*     */   private final ej d;
/*     */   
/*     */   public biz(ej paramej, bao parambao, bdw parambdw) {
/*  34 */     this.d = paramej;
/*  35 */     this.b = parambao;
/*  36 */     this.c = parambdw;
/*     */   }
/*     */   
/*     */   public void a(jt paramjt)
/*     */   {
/*  41 */     SecretKey localSecretKey = pt.a();
/*  42 */     String str1 = paramjt.c();
/*  43 */     PublicKey localPublicKey = paramjt.d();
/*  44 */     String str2 = new BigInteger(pt.a(str1, localPublicKey, localSecretKey)).toString(16);
/*     */     
/*  46 */     int i = (this.b.E() == null) || (!this.b.E().d()) ? 1 : 0;
/*     */     try {
/*  48 */       c().joinServer(this.b.M().e(), this.b.M().d(), str2);
/*     */     } catch (AuthenticationUnavailableException localAuthenticationUnavailableException) {
/*  50 */       if (i != 0) {
/*  51 */         this.d.a(new fr("disconnect.loginFailedInfo", new Object[] { new fr("disconnect.loginFailedInfo.serversUnavailable", new Object[0]) }));
/*  52 */         return;
/*     */       }
/*     */     } catch (InvalidCredentialsException localInvalidCredentialsException) {
/*  55 */       if (i != 0) {
/*  56 */         this.d.a(new fr("disconnect.loginFailedInfo", new Object[] { new fr("disconnect.loginFailedInfo.invalidSession", new Object[0]) }));
/*  57 */         return;
/*     */       }
/*     */     } catch (AuthenticationException localAuthenticationException) {
/*  60 */       if (i != 0) {
/*  61 */         this.d.a(new fr("disconnect.loginFailedInfo", new Object[] { localAuthenticationException.getMessage() }));
/*  62 */         return;
/*     */       }
/*     */     }
/*     */     
/*  66 */     this.d.a(new jx(localSecretKey, localPublicKey, paramjt.e()), new GenericFutureListener[] { new bja(this, localSecretKey) });
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private MinecraftSessionService c()
/*     */   {
/*  75 */     return new YggdrasilAuthenticationService(this.b.O(), UUID.randomUUID().toString()).createMinecraftSessionService();
/*     */   }
/*     */   
/*     */   public void a(js paramjs)
/*     */   {
/*  80 */     this.d.a(eo.b);
/*     */   }
/*     */   
/*     */   public void a(fj paramfj)
/*     */   {
/*  85 */     this.b.a(new bdf(this.c, "connect.failed", paramfj));
/*     */   }
/*     */   
/*     */   public void a(eo parameo1, eo parameo2)
/*     */   {
/*  90 */     a.debug("Switching protocol from " + parameo1 + " to " + parameo2);
/*  91 */     if (parameo2 == eo.b) {
/*  92 */       this.d.a(new bjb(this.b, this.c, this.d));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a() {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(ju paramju)
/*     */   {
/* 108 */     this.d.a(paramju.c());
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\biz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */