/*    */ import com.google.common.collect.BiMap;
/*    */ import com.google.common.collect.HashBiMap;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cw
/*    */   extends da
/*    */   implements cs
/*    */ {
/* 14 */   protected final ct a = new ct();
/*    */   protected final Map b;
/*    */   
/*    */   public cw()
/*    */   {
/* 19 */     this.b = ((BiMap)this.c).inverse();
/*    */   }
/*    */   
/*    */   public void a(int paramInt, String paramString, Object paramObject) {
/* 23 */     this.a.a(paramObject, paramInt);
/* 24 */     a(c(paramString), paramObject);
/*    */   }
/*    */   
/*    */   protected Map a()
/*    */   {
/* 29 */     return HashBiMap.create();
/*    */   }
/*    */   
/*    */ 
/*    */   public Object a(String paramString)
/*    */   {
/* 35 */     return super.a(c(paramString));
/*    */   }
/*    */   
/*    */   public String c(Object paramObject)
/*    */   {
/* 40 */     return (String)this.b.get(paramObject);
/*    */   }
/*    */   
/*    */   public boolean b(String paramString)
/*    */   {
/* 45 */     return super.d(c(paramString));
/*    */   }
/*    */   
/*    */   public int b(Object paramObject)
/*    */   {
/* 50 */     return this.a.b(paramObject);
/*    */   }
/*    */   
/*    */   public Object a(int paramInt)
/*    */   {
/* 55 */     return this.a.a(paramInt);
/*    */   }
/*    */   
/*    */   public Iterator iterator()
/*    */   {
/* 60 */     return this.a.iterator();
/*    */   }
/*    */   
/*    */   public boolean b(int paramInt) {
/* 64 */     return this.a.b(paramInt);
/*    */   }
/*    */   
/*    */   private static String c(String paramString)
/*    */   {
/* 69 */     return paramString.indexOf(':') == -1 ? "minecraft:" + paramString : paramString;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */