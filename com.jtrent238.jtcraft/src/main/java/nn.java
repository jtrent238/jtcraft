/*     */ import com.google.common.base.Charsets;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.security.KeyPair;
/*     */ import java.security.PrivateKey;
/*     */ import java.util.Arrays;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import javax.crypto.SecretKey;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.lang3.Validate;
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
/*     */ public class nn
/*     */   implements jv
/*     */ {
/*  29 */   private static final AtomicInteger b = new AtomicInteger(0);
/*  30 */   private static final Logger c = LogManager.getLogger();
/*     */   
/*  32 */   private static final Random d = new Random();
/*     */   
/*  34 */   private final byte[] e = new byte[4];
/*     */   private final MinecraftServer f;
/*     */   public final ej a;
/*  37 */   private np g = np.a;
/*     */   private int h;
/*     */   private GameProfile i;
/*  40 */   private String j = "";
/*     */   private SecretKey k;
/*     */   
/*     */   public nn(MinecraftServer paramMinecraftServer, ej paramej) {
/*  44 */     this.f = paramMinecraftServer;
/*  45 */     this.a = paramej;
/*  46 */     d.nextBytes(this.e);
/*     */   }
/*     */   
/*     */   public void a()
/*     */   {
/*  51 */     if (this.g == np.d) {
/*  52 */       c();
/*     */     }
/*  54 */     if (this.h++ == 600) {
/*  55 */       a("Took too long to log in");
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(String paramString)
/*     */   {
/*     */     try
/*     */     {
/*  66 */       c.info("Disconnecting " + d() + ": " + paramString);
/*  67 */       fq localfq = new fq(paramString);
/*  68 */       this.a.a(new ju(localfq), new GenericFutureListener[0]);
/*  69 */       this.a.a(localfq);
/*     */     } catch (Exception localException) {
/*  71 */       c.error("Error whilst disconnecting player", localException);
/*     */     }
/*     */   }
/*     */   
/*     */   public void c() {
/*  76 */     if (!this.i.isComplete()) {
/*  77 */       this.i = a(this.i);
/*     */     }
/*     */     
/*  80 */     String str = this.f.ah().a(this.a.b(), this.i);
/*  81 */     if (str != null) {
/*  82 */       a(str);
/*     */     } else {
/*  84 */       this.g = np.e;
/*  85 */       this.a.a(new js(this.i), new GenericFutureListener[0]);
/*  86 */       this.f.ah().a(this.a, this.f.ah().f(this.i));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(fj paramfj)
/*     */   {
/*  92 */     c.info(d() + " lost connection: " + paramfj.c());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String d()
/*     */   {
/* 100 */     if (this.i != null) return this.i.toString() + " (" + this.a.b().toString() + ")";
/* 101 */     return String.valueOf(this.a.b());
/*     */   }
/*     */   
/*     */   public void a(eo parameo1, eo parameo2)
/*     */   {
/* 106 */     Validate.validState((this.g == np.e) || (this.g == np.a), "Unexpected change in protocol", new Object[0]);
/* 107 */     Validate.validState((parameo2 == eo.b) || (parameo2 == eo.d), "Unexpected protocol " + parameo2, new Object[0]);
/*     */   }
/*     */   
/*     */   public void a(jw paramjw)
/*     */   {
/* 112 */     Validate.validState(this.g == np.a, "Unexpected hello packet", new Object[0]);
/* 113 */     this.i = paramjw.c();
/*     */     
/* 115 */     if ((this.f.Y()) && (!this.a.c())) {
/* 116 */       this.g = np.b;
/* 117 */       this.a.a(new jt(this.j, this.f.K().getPublic(), this.e), new GenericFutureListener[0]);
/*     */     } else {
/* 119 */       this.g = np.d;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(jx paramjx)
/*     */   {
/* 125 */     Validate.validState(this.g == np.b, "Unexpected key packet", new Object[0]);
/* 126 */     PrivateKey localPrivateKey = this.f.K().getPrivate();
/*     */     
/* 128 */     if (!Arrays.equals(this.e, paramjx.b(localPrivateKey))) {
/* 129 */       throw new IllegalStateException("Invalid nonce!");
/*     */     }
/*     */     
/* 132 */     this.k = paramjx.a(localPrivateKey);
/* 133 */     this.g = np.c;
/*     */     
/* 135 */     this.a.a(this.k);
/*     */     
/* 137 */     new no(this, "User Authenticator #" + b.incrementAndGet()).start();
/*     */   }
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
/*     */   protected GameProfile a(GameProfile paramGameProfile)
/*     */   {
/* 172 */     UUID localUUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + paramGameProfile.getName()).getBytes(Charsets.UTF_8));
/* 173 */     return new GameProfile(localUUID, paramGameProfile.getName());
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\nn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */