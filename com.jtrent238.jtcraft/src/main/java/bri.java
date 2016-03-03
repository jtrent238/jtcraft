/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParser;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.Reader;
/*    */ import java.util.Map;
/*    */ import org.apache.commons.io.IOUtils;
/*    */ 
/*    */ 
/*    */ public class bri
/*    */   implements bqw
/*    */ {
/* 16 */   private final Map a = Maps.newHashMap();
/*    */   private final bqx b;
/*    */   private final InputStream c;
/*    */   private final InputStream d;
/*    */   private final brw e;
/*    */   private boolean f;
/*    */   private JsonObject g;
/*    */   
/*    */   public bri(bqx parambqx, InputStream paramInputStream1, InputStream paramInputStream2, brw parambrw) {
/* 25 */     this.b = parambqx;
/* 26 */     this.c = paramInputStream1;
/* 27 */     this.d = paramInputStream2;
/* 28 */     this.e = parambrw;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public InputStream b()
/*    */   {
/* 38 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean c()
/*    */   {
/* 43 */     return this.d != null;
/*    */   }
/*    */   
/*    */   public bru a(String paramString)
/*    */   {
/* 48 */     if (!c()) {
/* 49 */       return null;
/*    */     }
/*    */     
/* 52 */     if ((this.g == null) && (!this.f)) {
/* 53 */       this.f = true;
/*    */       
/* 55 */       localObject1 = null;
/*    */       try {
/* 57 */         localObject1 = new BufferedReader(new InputStreamReader(this.d));
/* 58 */         this.g = new JsonParser().parse((Reader)localObject1).getAsJsonObject();
/*    */       } finally {
/* 60 */         IOUtils.closeQuietly((Reader)localObject1);
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 65 */     Object localObject1 = (bru)this.a.get(paramString);
/* 66 */     if (localObject1 == null) {
/* 67 */       localObject1 = this.e.a(paramString, this.g);
/*    */     }
/* 69 */     return (bru)localObject1;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 74 */     if (this == paramObject) { return true;
/*    */     }
/* 76 */     if ((paramObject instanceof bri)) {
/* 77 */       bri localbri = (bri)paramObject;
/*    */       
/* 79 */       return localbri.b == null ? true : this.b != null ? this.b.equals(localbri.b) : false;
/*    */     }
/*    */     
/* 82 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode()
/*    */   {
/* 87 */     if (this.b == null) { return 0;
/*    */     }
/* 89 */     return this.b.hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */