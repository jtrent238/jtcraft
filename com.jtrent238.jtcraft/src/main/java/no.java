/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import java.math.BigInteger;
/*     */ import java.security.KeyPair;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ class no
/*     */   extends Thread
/*     */ {
/* 137 */   no(nn paramnn, String paramString) { super(paramString); }
/*     */   
/*     */   public void run() {
/* 140 */     GameProfile localGameProfile = nn.a(this.a);
/*     */     try
/*     */     {
/* 143 */       String str = new BigInteger(pt.a(nn.b(this.a), nn.c(this.a).K().getPublic(), nn.d(this.a))).toString(16);
/* 144 */       nn.a(this.a, nn.c(this.a).av().hasJoinedServer(new GameProfile(null, localGameProfile.getName()), str));
/*     */       
/* 146 */       if (nn.a(this.a) != null) {
/* 147 */         nn.e().info("UUID of player " + nn.a(this.a).getName() + " is " + nn.a(this.a).getId());
/* 148 */         nn.a(this.a, np.d);
/* 149 */       } else if (nn.c(this.a).N()) {
/* 150 */         nn.e().warn("Failed to verify username but will let them in anyway!");
/* 151 */         nn.a(this.a, this.a.a(localGameProfile));
/* 152 */         nn.a(this.a, np.d);
/*     */       } else {
/* 154 */         this.a.a("Failed to verify username!");
/* 155 */         nn.e().error("Username '" + nn.a(this.a).getName() + "' tried to join with an invalid session");
/*     */       }
/*     */     } catch (AuthenticationUnavailableException localAuthenticationUnavailableException) {
/* 158 */       if (nn.c(this.a).N()) {
/* 159 */         nn.e().warn("Authentication servers are down but will let them in anyway!");
/* 160 */         nn.a(this.a, this.a.a(localGameProfile));
/* 161 */         nn.a(this.a, np.d);
/*     */       } else {
/* 163 */         this.a.a("Authentication servers are down. Please try again later, sorry!");
/* 164 */         nn.e().error("Couldn't verify username because servers are unavailable");
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\no.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */